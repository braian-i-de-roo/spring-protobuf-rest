package com.braian.protobufRestBackend.service;

import com.braian.protobufRestBackend.datastore.PersonDatastore;
import org.springframework.stereotype.Service;
import com.braian.protobufRestBackend.model.PersonOuterClass;

@Service
public class PersonService {

    private final PersonDatastore datastore;

    public PersonService(PersonDatastore datastore) {
        this.datastore = datastore;
    }

    public PersonOuterClass.Person getById(String id) {
        return datastore.getById(id);
    }
}
