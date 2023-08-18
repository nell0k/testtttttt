package com.accenture.javasquad.cinemateka.services;
import com.accenture.javasquad.cinemateka.entities.Movie;
import com.accenture.javasquad.cinemateka.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> readAllMovies() {

        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieByUuid(String uuid) {
        return movieRepository.findByUuid(uuid);
    }

    public Movie addMovie(Movie movie) {

        return movieRepository.save(movie);
    }
}