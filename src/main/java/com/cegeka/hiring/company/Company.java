package com.cegeka.hiring.company;

import java.util.List;

public class Company {
    private final String name;
    private final Benefits benefits;
    private List<String> perks;
    private LearningOpportunities learningOpportunities;

    public Company(String name, Benefits benefits, List<String> perks, LearningOpportunities learningOpportunities) {
        this.name = name;
        this.benefits = benefits;
        this.perks = perks;
        this.learningOpportunities = learningOpportunities;
    }

    public String getName() {
        return name;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public List<String> getPerks() {
        return perks;
    }

    public LearningOpportunities getLearningOpportunities() {
        return learningOpportunities;
    }
}
