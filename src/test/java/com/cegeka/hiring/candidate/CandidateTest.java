package com.cegeka.hiring.candidate;

import com.cegeka.hiring.company.Company;
import com.cegeka.hiring.company.CompanyTestBuilder;
import org.junit.Before;
import org.junit.Test;

public class CandidateTest {

    @Before
    public void setUp() throws Exception {
        Company cegeka = CompanyTestBuilder.company()
                .withName("Cegeka")
                .build();

        // flex income plan
        // company car
        // laptop
        // individual growth possibilities
        // variety of projects
        // excellent learning community
        // wide range of learning opportunities: (sub-builder)
        //      internal courses
        //      external courses
        //      reading groups
        //      event hosting (meetups)
        //      hackathons
        //      innovation projects
    }

    // TDD
    // OO skills
    // DDD bonus
    // continuous learning
    // welcomes pairing/teamplayer
    // keen eye for improvement
    // values devops

    @Test
    public void candidate_ShouldMatchOnDNAProperties() throws Exception {

    }

    @Test
    public void candidate_ShouldHaveRequiredExperience() throws Exception {

    }

    @Test
    public void candidate_WhenHasExperienceWithDDD_ThenGetsBonuspointsAtInterview() throws Exception {

    }

    @Test
    public void candidate_WhenCommunicating_PrefersHumansAndInteractionsOverProcessesAndTools() throws Exception {

    }

    @Test
    public void candidate_ShouldBeOpenMinded() throws Exception {

    }

    @Test
    public void candidate_WhenThursday_IsOpenForEatingFries() throws Exception {

    }

    // catch NoContinuousLearningException { .noRaise(); }
}
