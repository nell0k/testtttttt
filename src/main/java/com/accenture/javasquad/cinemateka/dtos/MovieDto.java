package com.accenture.javasquad.cinemateka.dtos;

public class MovieDto {
    private String movieName;
    private DirectorDto directorDto;

    public DirectorDto getDirectorDto() {
        return directorDto;
    }

    public void setDirectorDto(DirectorDto directorDto) {
        this.directorDto = directorDto;
    }

    //private MovieDto movie;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


}
