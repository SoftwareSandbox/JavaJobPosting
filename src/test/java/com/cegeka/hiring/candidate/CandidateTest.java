package com.cegeka.hiring.candidate;

import com.cegeka.hiring.company.Company;
import com.cegeka.hiring.company.CompanyTestBuilder;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static com.cegeka.hiring.candidate.CandidateTestBuilder.candidate;
import static com.cegeka.hiring.company.BenefitsTestBuilder.benefits;
import static com.cegeka.hiring.company.LearningOpportunitiesTestBuilder.learningOpportunities;
import static org.assertj.core.api.Assertions.assertThat;

public class CandidateTest {

    private Company cegeka;

    @Before
    public void setUp() throws Exception {
        cegeka = CompanyTestBuilder.company()
                .withName("Cegeka")
                .withBenefits(benefits()
                        .flexIncomePlan()
                        .companyCar()
                        .laptop()
                        .mealVouchers())
                .withPerks("Individual Growth possibilities",
                           "Variety of projects",
                           "Excellent learning community")
                .withLearningOpportunities(learningOpportunities()
                        .internalCourses("JavaScript Basic", "JavaScript Advanced", "Agile Software Engineering")
                        .externalCourses("The Lead Developer", "QCon", "Devoxx", "Techorama")
                        .readingGroups("DDD", "Refactoring")
                        .eventHosting("LeanCoffee Leuven Meetup", "Scala BE Meetup", "Facilitation GameLab")
                        .hackathons("Cegeka Exploration Days")
                        .innovationProjects())
                .build();
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
        Candidate matchingCandidate = candidate()
                .withDNAProperties("Learning Mentality",
                                   "Values Devops",
                                   "Welcomes pairing/teamplayer",
                                   "Keen eye for improvement")
                .build();
        assertThat(cegeka.isLookingFor(matchingCandidate)).isTrue();
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
