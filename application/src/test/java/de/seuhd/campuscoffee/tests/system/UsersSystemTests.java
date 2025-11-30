package de.seuhd.campuscoffee.tests.system;

import de.seuhd.campuscoffee.domain.model.User;
import de.seuhd.campuscoffee.domain.tests.TestFixtures;
import org.junit.jupiter.api.Test;
import java.util.List;

//import org.springframework.http.HttpStatus;

import static de.seuhd.campuscoffee.tests.SystemTestUtils.Requests.userRequests;
//import static org.assertj.core.api.Assertions.assertThat;

public class UsersSystemTests extends AbstractSysTest {

    //completed: Uncomment once user endpoint is implemented

   @Test
   void createUser() {
       User userToCreate = TestFixtures.getUserListForInsertion().getFirst();
       User createdUser = userDtoMapper.toDomain(userRequests.create(List.of(userDtoMapper.fromDomain(userToCreate))).getFirst());

       assertEqualsIgnoringIdAndTimestamps(createdUser, userToCreate);
   }

    //TODO: Add at least two additional tests for user operations

}