package com.accenture.javasquad.cinemateka;
import com.accenture.javasquad.cinemateka.dtos.MovieDto;
import com.accenture.javasquad.cinemateka.entities.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

    @Mapper(componentModel = "spring", uses = {DirectorMapper.class})
    public interface MovieMapper {

    @Mapping(source = "director", target = "directorDto")
    MovieDto movieToDto(Movie movie);
    @Mapping(source="directorDto", target="director")
    Movie dtoToMovie(MovieDto movieDto);


    List<MovieDto> moviesToDtos(List<Movie> movies);

    List<Movie> dtosToMovieList(List<MovieDto> movieDtos);
}