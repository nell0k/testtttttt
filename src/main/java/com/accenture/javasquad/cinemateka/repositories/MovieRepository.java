package com.accenture.javasquad.cinemateka.repositories;

import com.accenture.javasquad.cinemateka.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    Optional<Movie> findByUuid(String uuid);
}
