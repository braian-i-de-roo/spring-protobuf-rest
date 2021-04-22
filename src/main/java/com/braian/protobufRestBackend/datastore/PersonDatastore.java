package com.braian.protobufRestBackend.datastore;

import com.braian.protobufRestBackend.model.PersonOuterClass;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDatastore {

    public PersonOuterClass.Person getById(String id) {
        var address = PersonOuterClass.Address.newBuilder()
            .setStreet("Jose Hernandez")
            .setNumber(1038)
            .build();

        return PersonOuterClass.Person.newBuilder()
            .setId(id)
            .setName("Braian")
            .setLastname("De Roo")
            .setAddress(address)
            .build();
    }
}
