package com.accenture.javasquad.cinemateka.controllers;

import com.accenture.javasquad.cinemateka.DirectorMapper;
import com.accenture.javasquad.cinemateka.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @Autowired
    private DirectorMapper directorMapper;


}
