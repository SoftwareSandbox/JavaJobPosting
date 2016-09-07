package com.cegeka.hiring.company;

import java.util.Arrays;
import java.util.List;

public class CompanyTestBuilder {
    private String name;
    private Benefits benefits;
    private List<String> perks;
    private LearningOpportunities learningOpportunities;

    public static CompanyTestBuilder company() {
        return new CompanyTestBuilder();
    }

    public CompanyTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Company build() {
        return new Company(name, benefits, perks, learningOpportunities);
    }

    public CompanyTestBuilder withBenefits(BenefitsTestBuilder benefitsTestBuilder) {
        this.benefits = benefitsTestBuilder.build();
        return this;
    }

    public CompanyTestBuilder withPerks(String... perks) {
        this.perks = Arrays.asList(perks);
        return this;
    }

    public CompanyTestBuilder withLearningOpportunities(LearningOpportunitiesTestBuilder learningOpportunitiesTestBuilder) {
        this.learningOpportunities = learningOpportunitiesTestBuilder.build();
        return this;
    }
}
