package com.moaaz.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class PropertiesController {

    @Autowired
    private Property property;


    @GetMapping
    public String getProperty() {
        return "Property Name Is [%s] and Property Description is [%s]".formatted(property.getName(), property.getDescription());
    }
}
