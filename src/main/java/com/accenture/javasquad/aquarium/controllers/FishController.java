package com.accenture.javasquad.aquarium.controllers;

import com.accenture.javasquad.aquarium.DTO.FishDto;
import com.accenture.javasquad.aquarium.FishMapper;
import com.accenture.javasquad.aquarium.entities.Fish;
import com.accenture.javasquad.aquarium.services.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
    public class FishController {

    @Autowired
    private FishService fishService;
    @Autowired
    private FishMapper fishMapper;

    /*@PostMapping("/fish")
    public ResponseEntity<Fish> addFish(@RequestBody FishDto fishDto) {
        if (fishDto.getFishName().length()<=2) {
            return ResponseEntity.badRequest().build();
        }
        Fish fish=fishMapper.mapFromDto((fishDto));
        return ResponseEntity.ok(fishService.addFish(fish));
    }*/

    @GetMapping("/fish")
    public ResponseEntity<List<FishDto>> readAllFish() {
            List<Fish> fishList = fishService.readAll();
            List<FishDto> fishDtoList = fishMapper.fishListToDtos(fishList);
            return ResponseEntity.ok(fishDtoList);
        }

    @GetMapping("/fish/{fuuid}")
    public ResponseEntity<FishDto> readOneFish(@PathVariable("fuuid") String uuid) {
            Optional<Fish> fishByUuid = fishService.readOne(uuid);
            if (fishByUuid.isPresent()) {
                return ResponseEntity.ok(fishMapper.fishToDto(fishByUuid.get()));
            }

            return ResponseEntity.notFound().build();
        }

    @PostMapping("/fish")
    public ResponseEntity createFish(@RequestBody FishDto fishDto) {
        Fish fish = fishMapper.dtoToFish(fishDto);
        fishService.createFish(fish);
        return ResponseEntity.noContent().build();
    }
    }

       /* @Autowired
        private FishRepository ;

    }
        private JdbcTemplate ;


        public FishController(JdbcTemplate jdbcTemplate) {

            this.jdbcTemplate = jdbcTemplate;
        }*/

        /*@PostMapping("/listOfFish")
        public Fish createFish(@RequestBody Fish fish) {
            List<Fish> listOfFish = new ArrayList<>();
            Random random = new Random();
            int randomNumber = random.nextInt(100000);
            fish.setId(randomNumber);
            listOfFish.add(fish);
            return fish;
        }*/

       /* @GetMapping("/listOfFish")
        public List<Fish> listOfFish() {

            List<Fish> listOfFish = jdbcTemplate.query(
                    " SELECT my_aquarium.id, my_aquarium.fish_name, fish_type.fish_type, fish_location.location FROM my_aquarium JOIN fish_type ON my_aquarium.fish_type_id=fish_type.id JOIN fish_location ON my_aquarium.fish_location_id=fish_location.id ; ",
                    new FishRowMapper()
            );

            return listOfFish;
        }
    }*/
       /*@GetMapping("/listOfFish/{fishId}")
        public Fish readOneFish (@PathVariable("fishId") Integer id) {
            List<Fish> listOfFish = jdbcTemplate.query( "SELECT fish_name, fish_type_id, fish_location_id " +
                    " FROM my_aquarium WHERE id= ? ; ",
                    new FishRowMapper()
            );
            for (Fish fish : listOfFish) {
                if (fish.getId().equals(id)) {
                    return fish;
                }
            }
            return null;
        }*/

       /* @DeleteMapping("/listOfFish/{fishId}")
        public Fish deleteOneFish (@PathVariable("fishId") Integer id) {

            return null;
        }*/


