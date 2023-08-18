package com.accenture.javasquad.aquarium.repositories;

import com.accenture.javasquad.aquarium.entities.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FishJpaRepository extends JpaRepository<Fish,String> {
    Optional<Fish> findByUuid(String uuid);
}
