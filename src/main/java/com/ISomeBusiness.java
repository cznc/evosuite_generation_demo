package com;

import com.entity.IdInfoEntity;

import java.util.List;

public interface ISomeBusiness {
    int getAging(int age, String name, boolean isMan,
                 List<IdInfoEntity> ids) throws Exception;
}
