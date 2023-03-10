package microservices.book.multiplication.challenge;

import microservices.book.multiplication.user.User;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {


    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDto) {
        //Check if the attempt is correct
        boolean isCorrect = attemptDto.getGuess() ==
                attemptDto.getFactorA() * attemptDto.getFactorB();

        //we don't use identifiers for now
        User user = new User(null, attemptDto.getUserAlias());

        //Builds the domain object. Null id for now
        ChallengeAttempt checkedAttempt = new ChallengeAttempt(
                null,
                user,//user.getId()
                attemptDto.getFactorA(),
                attemptDto.getFactorB(),
                attemptDto.getGuess(),
                isCorrect);

        return checkedAttempt;
    }
}
