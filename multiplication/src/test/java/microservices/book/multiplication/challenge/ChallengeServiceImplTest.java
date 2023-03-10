package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceImplTest {

    private ChallengeService challengeService;

    @BeforeEach
    public void setup() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest() {
        //given
        ChallengeAttemptDTO attemptDto
                = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);

        //when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDto);

        //then
        then(resultAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkIncorrectAttemptTest() {
        //given
        ChallengeAttemptDTO attemptDto
                = new ChallengeAttemptDTO(50, 60, "john_doe", 5000);

        //when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDto);

        //then
        then(resultAttempt.isCorrect()).isFalse();
    }
}
