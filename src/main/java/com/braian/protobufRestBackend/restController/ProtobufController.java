package com.braian.protobufRestBackend.restController;

import com.braian.protobufRestBackend.service.PersonService;
import com.braian.protobufRestBackend.model.PersonOuterClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtobufController {

    private final PersonService service;

    public ProtobufController(PersonService service) {
        this.service = service;
    }

    @GetMapping(path="/person/{id}")
    public PersonOuterClass.Person getGenericPerson(@PathVariable String id) {
        return service.getById(id);
    }
}
