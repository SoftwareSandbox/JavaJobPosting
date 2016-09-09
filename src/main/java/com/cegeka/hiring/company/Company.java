package com.cegeka.hiring.company;

import com.cegeka.hiring.candidate.Candidate;

import java.math.BigDecimal;
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

    public MatchOutcome isLookingFor(Candidate candidate) {
        return MatchOutcome.UNLIKELY;
    }

    public boolean attributesBonusPointsAtInterview(Candidate candidate) {
        return false;
    }

    public BigDecimal giveRaiseTo(Candidate decliningCandidate) throws NoRaiseForYouException {
        return BigDecimal.ZERO;
    }
}
