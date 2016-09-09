package com.cegeka.hiring.candidate;

import com.cegeka.hiring.company.Proposition;

import java.util.List;

public class Candidate {
    private List<String> dna;
    private List<String> skills;
    private CommunicationType preferredWayOfCommunicating;
    private List<String> selfProclamations;
    private List<Proposition> decliningPropositions;

    public Candidate(List<String> dna, List<String> skills, CommunicationType preferredWayOfCommunicating, List<String> selfProclamations) {
        this.dna = dna;
        this.skills = skills;
        this.preferredWayOfCommunicating = preferredWayOfCommunicating;
        this.selfProclamations = selfProclamations;
    }

    public void willDecline(Proposition proposition) {
        this.decliningPropositions.add(proposition);
    }
}
