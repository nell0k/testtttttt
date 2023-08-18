package com.accenture.javasquad.cinemateka.repositories;

import com.accenture.javasquad.cinemateka.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DirectorRepository extends JpaRepository<Director, Long> {
    //@Query ("SELECT id FROM movie_directors WHERE fullName=? ")
    Optional<Director> findByFullName(String fullName);
}
