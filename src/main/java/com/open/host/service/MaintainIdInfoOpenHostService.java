package com.open.host.service;

import com.ISomeBusiness;
import com.SomeBusiness;
import com.entity.IdInfoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(("/v1/idInfo"))
public class MaintainIdInfoOpenHostService {
    @Autowired
    private ISomeBusiness someBusiness;
    @GetMapping("/query/{no}")
    public IdInfoEntity getUserById(@PathVariable String no) {
        IdInfoEntity entity = new IdInfoEntity();

        List<IdInfoEntity> list = new ArrayList<>();

        entity=new IdInfoEntity();
        entity.setCrdNo("1234567");
        entity.setCrdTp("04");
        list.add(entity);
        int ii = 0;

        try {
            ii = someBusiness.getAging(2, null, true, list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.debug("ii="+ii);

        if (log.isInfoEnabled()) {
            log.info("idInfo {}", entity);
        }

        return entity;
    }

}

