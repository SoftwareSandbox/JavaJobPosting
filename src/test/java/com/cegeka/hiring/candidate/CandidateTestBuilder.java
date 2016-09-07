package com.cegeka.hiring.candidate;

import java.util.Arrays;
import java.util.List;

public class CandidateTestBuilder {

    private List<String> dna;

    public static CandidateTestBuilder candidate() {
        return new CandidateTestBuilder();
    }

    private CandidateTestBuilder(){}

    public Candidate build(){
        return new Candidate(dna);
    }

    public CandidateTestBuilder withDNAProperties(String... dna) {
        this.dna = Arrays.asList(dna);
        return this;
    }
}
