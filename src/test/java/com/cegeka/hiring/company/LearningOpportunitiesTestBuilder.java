package com.cegeka.hiring.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearningOpportunitiesTestBuilder {

    private List<String> internalCourses = new ArrayList<String>();
    private List<String> externalCourses = new ArrayList<String>();
    private List<String> readingGroups = new ArrayList<String>();
    private List<String> events = new ArrayList<String>();
    private List<String> hackathons = new ArrayList<String>();
    private List<String> innovations = new ArrayList<String>();

    public static LearningOpportunitiesTestBuilder learningOpportunities(){
        return new LearningOpportunitiesTestBuilder();
    }

    private LearningOpportunitiesTestBuilder(){}

    public LearningOpportunities build(){
        LearningOpportunities learningOpportunities = new LearningOpportunities();
        learningOpportunities.add(internalCourses);
        learningOpportunities.add(externalCourses);
        learningOpportunities.add(readingGroups);
        learningOpportunities.add(events);
        learningOpportunities.add(hackathons);
        learningOpportunities.add(innovations);
        return learningOpportunities;
    }

    public LearningOpportunitiesTestBuilder internalCourses(String... internalCourses) {
        this.internalCourses = Arrays.asList(internalCourses);
        return this;
    }

    public LearningOpportunitiesTestBuilder externalCourses(String... externalCourses) {
        this.externalCourses = Arrays.asList(externalCourses);
        return this;
    }

    public LearningOpportunitiesTestBuilder readingGroups(String... readingGroups) {
        this.readingGroups = Arrays.asList(readingGroups);
        return this;
    }

    public LearningOpportunitiesTestBuilder eventHosting(String... events) {
        this.events = Arrays.asList(events);
        return this;
    }

    public LearningOpportunitiesTestBuilder hackathons(String... hackathons) {
        this.hackathons = Arrays.asList(hackathons);
        return this;
    }

    public LearningOpportunitiesTestBuilder innovationProjects(String... innovations) {
        this.innovations = Arrays.asList(innovations);
        return this;
    }
}
