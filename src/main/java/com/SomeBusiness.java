package com;

import com.common.NdcException;
import com.entity.IdInfoDTO;
import com.entity.IdInfoEntity;
import com.mapstruct.IdMapstruct;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SomeBusiness {
    public static void main(String[] args) throws Exception {
        SomeBusiness someBusiness = new SomeBusiness();
        List<IdInfoEntity> list = new ArrayList<>();
        IdInfoEntity entity = null;
        entity=new IdInfoEntity();
        entity.setCrdNo("1234567");
        entity.setCrdTp("04");
        list.add(entity);
        int ii = someBusiness.getAging(2, null, true, list);
        log.debug("ii="+ii);
    }


    public int getAging(int age, String name, boolean isMan,
                        List<IdInfoEntity> ids) throws Exception{

        int aging = 0;
        if(name == null) return 0;
        if(age<1){
            throw new NdcException("Age cannot less that zero.");
        }
        if(age>200){
            throw new NdcException("Age cannot bigger that two hundred.");
        }
        if(isMan){
            aging = age + 30;
        }else{
            aging = age + 13;
        }
        for (IdInfoEntity entity:ids){
            if("04".equals(entity.getCrdTp())){
                aging += 5;
                IdInfoDTO dto = IdMapstruct.INSTANCE.toIdInfoDTO(entity);
                log.debug("Yes it: {}, {}", dto.getCrdNo(), dto.getCrdTp());
            }
        }
        return aging;
    }
}
