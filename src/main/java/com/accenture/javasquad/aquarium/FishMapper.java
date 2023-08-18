package com.accenture.javasquad.aquarium;

import com.accenture.javasquad.aquarium.DTO.FishDto;
import com.accenture.javasquad.aquarium.entities.Fish;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface FishMapper {
    FishDto fishToDto(Fish fish);

    Fish dtoToFish(FishDto fishDto);

    List<FishDto> fishListToDtos(List<Fish> fishList);

    List<Fish> dtosToFishList(List<FishDto> fishDtoList);
}
