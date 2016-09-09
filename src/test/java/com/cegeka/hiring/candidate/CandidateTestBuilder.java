package com.cegeka.hiring.candidate;

import com.cegeka.hiring.company.Proposition;

import java.util.Arrays;
import java.util.List;

public class CandidateTestBuilder {

    private List<String> dna;
    private List<String> skills;
    private CommunicationType preferredWayOfCommunicating;
    private List<String> proclamations;
    private Proposition proposition;

    public static CandidateTestBuilder candidate() {
        return new CandidateTestBuilder();
    }

    private CandidateTestBuilder(){}

    public Candidate build(){
        Candidate candidate = new Candidate(dna, skills, preferredWayOfCommunicating, proclamations);
        candidate.willDecline(proposition);
        return candidate;
    }

    public CandidateTestBuilder withDNAProperties(String... dna) {
        this.dna = Arrays.asList(dna);
        return this;
    }

    public CandidateTestBuilder withSkills(String... skills) {
        this.skills = Arrays.asList(skills);
        return this;
    }

    public CandidateTestBuilder withCommunicationPreference(CommunicationType communicationType) {
        this.preferredWayOfCommunicating = communicationType;
        return this;
    }

    public CandidateTestBuilder withSelfProclamations(String... proclamations) {
        this.proclamations = Arrays.asList(proclamations);
        return this;
    }

    public CandidateTestBuilder decliningOffersOf(Proposition proposition) {
        this.proposition = proposition;
        return this;
    }
}
