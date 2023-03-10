package microservices.book.multiplication.user;

import lombok.*;

/**
 * Stores information to identify the User
 */

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {
    private Long id;
    private String alias;
}
