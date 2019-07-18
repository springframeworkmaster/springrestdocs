package com.tasks.app.restdocs.web.mappers;

import org.mapstruct.Mapper;

import com.tasks.app.restdocs.domain.Beer;
import com.tasks.app.restdocs.web.model.BeerDto;


@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
