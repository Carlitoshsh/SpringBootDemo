package com.demo.p80.repository;

import com.demo.p80.P80Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepo implements IPersonaRepo {

    private static Logger LOG = LoggerFactory.getLogger(P80Application.class);

    @Override
    public void register(String name) {
        LOG.info(name + " is registered!");
    }

}
