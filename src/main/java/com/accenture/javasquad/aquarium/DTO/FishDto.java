package com.accenture.javasquad.aquarium.DTO;

public class FishDto {

    private String uuid;
    private String fishName;
    private Integer fishType;

    private Integer location;

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