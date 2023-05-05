package com.mapstruct;

import com.entity.IdInfoDTO;
import com.entity.IdInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IdMapstruct {
    IdMapstruct INSTANCE = Mappers.getMapper(IdMapstruct.class);

    IdInfoDTO toIdInfoDTO(IdInfoEntity id);
}
