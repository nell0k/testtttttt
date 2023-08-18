package com.accenture.javasquad.cinemateka;
import com.accenture.javasquad.cinemateka.dtos.DirectorDto;
import com.accenture.javasquad.cinemateka.entities.Director;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")


public interface DirectorMapper {
    Director dtoToDirector(DirectorDto directorDto);
    DirectorDto directorToDto(Director director);

    List<Director> dtosToDirectors(List<DirectorDto> directorDtos);

    List<DirectorDto> directorToDtos(List<Director> directors);
}