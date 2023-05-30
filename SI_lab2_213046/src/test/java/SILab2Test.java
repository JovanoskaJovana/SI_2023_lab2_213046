import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void EveryBranchCriteria() {
        RuntimeException exception;
        User nullUser = null;
        List <User> nullUserList = new ArrayList<User>();
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(nullUser,nullUserList));

        User existingUser = new User("jovana", "panc", "jovana@gmai.com");
        User newUser = new User("null", "panc","jovanoska@gmail.com");
        List <User> userList = new ArrayList<User>(Arrays.asList(existingUser));
        assertFalse(SILab2.function(newUser, userList));

        User existingUser1 = new User("jovana", "panc", "jovana@gmai.com");
        User newUser1 = new User("joki", "panc","jovana@gmail.com");
        List <User> userList2 = new ArrayList<User>(Arrays.asList(existingUser1));
        assertFalse(SILab2.function(newUser, userList2));

        User existingUser2 = new User("jovana", "pancake123!", "jovanagmailcom");
        User newUser2 = new User("jovana", "pancake123!", "jovanagmailcom");
        List <User> userList1 = new ArrayList<User>(Arrays.asList(existingUser2));
        assertFalse(SILab2.function(newUser2,userList1));

        List <User> listOfUsers= new ArrayList<User>();

        User newUser4 = new User("", "jovana123", "");
        assertFalse(SILab2.function(newUser4,listOfUsers));

        User newUser5 = new User("", "jovana jovana", "");
        assertFalse(SILab2.function(newUser5,listOfUsers));
    }

    @Test
    void MultipleCondition(){
        RuntimeException exception;
        User nullUser = null;
        List<User> allUsers =  new ArrayList<>();
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(nullUser,allUsers));

        User user = new User("", null, "");
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(user,allUsers));

        User user1 = new User("", "", null);
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(user1,allUsers));

        User user2 = new User(null, null, null);
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(user2,allUsers));
    }
}