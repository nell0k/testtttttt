package com.accenture.javasquad.cinemateka.services;

import com.accenture.javasquad.cinemateka.entities.Director;
import com.accenture.javasquad.cinemateka.repositories.DirectorRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService {
    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {

        this.directorRepository = directorRepository;
    }

    public List<Director> readAllDirectors() {

        return directorRepository.findAll();
    }

    public Director addDirector(Director director) {

        return directorRepository.save(director);
    }
}
