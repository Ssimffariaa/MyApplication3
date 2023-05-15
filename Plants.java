package com.example.myapplication3;

public class Plants {
    private String name;
    private String plantsDescription;
    private String numberOfSpecies;
    private int plantsRes;

    public Plants(String name, String plantsDescription, int plantsRes,  String numberOfSpecies) {
        this.name = name;
        this.plantsDescription = plantsDescription;
        this.numberOfSpecies = numberOfSpecies;
        this.plantsRes = plantsRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantsDescription() {
        return plantsDescription;
    }

    public void setPlantsDescription(String plantsDescription) {
        this.plantsDescription = plantsDescription;
    }

    public String getNumberOfSpecies() {
        return numberOfSpecies;
    }

    public void setNumberOfSpecies(String numberOfSpecies) {
        this.numberOfSpecies = numberOfSpecies;
    }

    public int getPlantsRes() {
        return plantsRes;
    }

    public void setPlantsRes(int plantsRes) {
        this.plantsRes = plantsRes;
    }
}
