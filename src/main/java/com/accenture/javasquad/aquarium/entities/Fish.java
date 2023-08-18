package com.accenture.javasquad.aquarium.entities;

import jakarta.persistence.*;

@Entity
@Table(name="my_aquarium")
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="uu_id")
    private String uuid;

    @Column (name="fish_name")
    private String fishName;
    @Column (name="fish_type_id")
    private Integer fishType;
    @Column (name="fish_location_id")
    private Integer location;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public Integer getFishType() {
        return fishType;
    }

    public void setFishType(Integer fishType) {
        this.fishType = fishType;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }
}
