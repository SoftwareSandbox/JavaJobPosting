package com.cegeka.hiring;

import com.cegeka.hiring.candidate.Candidate;
import com.cegeka.hiring.company.*;
import org.junit.Before;
import org.junit.Test;

import static com.cegeka.hiring.candidate.CandidateTestBuilder.candidate;
import static com.cegeka.hiring.candidate.CommunicationType.MAIL;
import static com.cegeka.hiring.candidate.CommunicationType.SPEECH;
import static com.cegeka.hiring.company.BenefitsTestBuilder.benefits;
import static com.cegeka.hiring.company.LearningOpportunitiesTestBuilder.learningOpportunities;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ShouldRunInContinuousIntegration
public class CegekaCandidateEvaluationTest {

    private Company cegeka;

    @Before
    public void setUp() throws Exception {
        cegeka = CompanyTestBuilder.company()
                .withName("Cegeka")
                .withBenefits(benefits()
                        .flexIncomePlan()
                        .companyCar()
                        .laptop()
                        .mealVouchers()
                        .medcare())
                .withPerks("Individual Growth possibilities",
                           "Variety of projects",
                           "Excellent learning community")
                .withLearningOpportunities(learningOpportunities()
                        .internalCourses("JavaScript Basic", "JavaScript Advanced", "Agile Software Engineering")
                        .externalCourses("The Lead Developer", "QCon", "Devoxx", "Techorama")
                        .readingGroups("DDD", "Refactoring")
                        .eventHosting("LeanCoffee Leuven Meetup", "Scala BE Meetup", "Facilitation GameLab")
                        .hackathons("Cegeka Exploration Days")
                        .innovationProjects("Continuous Delivery Pipeline", "Build Radiator"))
                .build();
    }

    @Test
    public void candidate_ShouldMatchOnDNAProperties() throws Exception {
        Candidate matchingCandidate = candidate()
                .withDNAProperties("Learning Mentality",
                                   "Values Devops",
                                   "Welcomes pairing/teamplayer",
                                   "Keen eye for improvement",
                                   "Open minded")
                .build();
        assertThat(cegeka.isLookingFor(matchingCandidate)).isEqualTo(MatchOutcome.VERY_LIKELY);
    }

    @Test
    public void candidate_ShouldHaveRequiredSkills() throws Exception {
        Candidate matchingCandidate = candidate()
                .withSkills("Test Driven Development",
                            "Object Oriented Programming",
                            "Refactoring",
                            "Continuous Integration")
                .build();
        assertThat(cegeka.isLookingFor(matchingCandidate)).isEqualTo(MatchOutcome.VERY_LIKELY);
    }

    @Test
    public void candidate_WhenCommunicating_PrefersHumansAndInteractionsOverProcessesAndTools() throws Exception {
        Candidate matchingCandidate = candidate().withCommunicationPreference(SPEECH).build();
        assertThat(cegeka.isLookingFor(matchingCandidate)).isEqualTo(MatchOutcome.VERY_LIKELY);

        Candidate nonMatchingCandidate = candidate().withCommunicationPreference(MAIL).build();
        assertThat(cegeka.isLookingFor(nonMatchingCandidate)).isEqualTo(MatchOutcome.UNLIKELY);
    }

    @Test
    public void candidate_WithCertainSelfProclamations_DoesNotMatchWithCegeka() throws Exception {
        Candidate nonmatchingCandidate = candidate()
                .withSelfProclamations("I know all there is to know about Software Engineering.",
                                       "I don't care what other people say, I'm always right anyways.",
                                       "Why would you write tests for a code change as small as that?")
                .build();
        assertThat(cegeka.isLookingFor(nonmatchingCandidate)).isEqualTo(MatchOutcome.NO_EFFING_WAY);
    }

    @Test
    public void whenHasExperienceWithDDD_ThenGetsBonuspointsAtInterview() throws Exception {
        Candidate matchingCandidate = candidate().withSkills("Domain Driven Design").build();
        assertThat(cegeka.attributesBonusPointsAtInterview(matchingCandidate)).isTrue();
    }

    @Test
    public void whenOfferedParticipationInReadingGroup_AndDeclines_NoRaiseForYou() throws Exception {
        Candidate scrub = candidate().decliningOffersOf(new ReadingGroupProposition()).build();
        assertThatThrownBy(() -> cegeka.giveRaiseTo(scrub))
                .isInstanceOf(NoRaiseForYouException.class)
                .hasMessage("NO RAISE FOR YOU, SCRUB!");
    }
}
