package microservices.book.multiplication.challenge;

import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

/**
 * Attempt coming from the user
 */

/*
@Value is the immutable variant of @Data;
All fields are made private and final by default, and setters are not generated.
toString(), equals() and hashCode() methods are also generated.
*/
@Value
public class ChallengeAttemptDTO {

    @Min(1) @Max(99)
    private final int factorA, factorB;

    @NotBlank
    private final String userAlias;

    @Positive(message = "How could you possibly get a negative result here? Try again.")
    private final int guess;

}
