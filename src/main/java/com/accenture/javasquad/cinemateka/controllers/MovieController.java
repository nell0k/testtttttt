package com.accenture.javasquad.cinemateka.controllers;
import com.accenture.javasquad.cinemateka.DirectorMapper;
import com.accenture.javasquad.cinemateka.MovieMapper;
import com.accenture.javasquad.cinemateka.dtos.DirectorDto;
import com.accenture.javasquad.cinemateka.dtos.MovieDto;
import com.accenture.javasquad.cinemateka.entities.Director;
import com.accenture.javasquad.cinemateka.entities.Movie;
import com.accenture.javasquad.cinemateka.repositories.DirectorRepository;
import com.accenture.javasquad.cinemateka.services.DirectorService;
import com.accenture.javasquad.cinemateka.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private DirectorService directorService;

    @Autowired
    private DirectorMapper directorMapper;

    @Autowired
    private DirectorRepository directorRepository;

    @GetMapping("/movies/{uuid}")
    public ResponseEntity<MovieDto> readByUuid(
            @PathVariable("uuid") String uuid) {
        Optional<Movie> movieByUuid = movieService.findMovieByUuid(uuid);
        if (movieByUuid.isPresent()) {
            return ResponseEntity.ok(movieMapper.movieToDto(movieByUuid.get()));
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/movies")
    public ResponseEntity<List<MovieDto>> readAllMovies() {
        List<Movie> movies = movieService.readAllMovies();
        List<MovieDto> movieDtos = movieMapper.moviesToDtos(movies);
        return ResponseEntity.ok(movieDtos);
    }

    @PostMapping("/movies")
    public ResponseEntity addMovie(@RequestBody MovieDto movieDto) {
        Movie movie = movieMapper.dtoToMovie(movieDto);

        /*Optional<Director> directorByFullName=directorRepository.findByFullName(director.getFullName());
        if (directorByFullName.isPresent()) {
            throw new IllegalStateException("This director is already in the database");
        }*/
        //Director director= directorMapper.dtoToDirector(directorDto);
        //directorService.addDirector(director);
        directorRepository.save(movie.getDirector());
        movieService.addMovie(movie);
        return ResponseEntity.noContent().build();
    }
}
