package com.demo.p80.service;

import com.demo.p80.repository.PersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepo persona;

    @Override
    public void register(String name) {
        persona.register(name);
    }

}
