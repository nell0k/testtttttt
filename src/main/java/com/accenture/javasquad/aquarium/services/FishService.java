package com.accenture.javasquad.aquarium.services;

import com.accenture.javasquad.aquarium.entities.Fish;
import com.accenture.javasquad.aquarium.repositories.FishJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
    @Service
    public class FishService {


        private final FishJpaRepository fishJpaRepository;
        @Autowired
        public FishService(FishJpaRepository fishJpaRepository) {

            this.fishJpaRepository = fishJpaRepository;
        }

        public List<Fish> readAll() {

            return fishJpaRepository.findAll();
        }

        public Optional<Fish> readOne(String uuid) {

            return fishJpaRepository.findByUuid(uuid);
        }
        public Fish createFish(Fish fish) {

            return fishJpaRepository.save(fish);
        }
    }


