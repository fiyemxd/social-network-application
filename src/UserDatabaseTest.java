import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class UserDatabaseTest {
    private UserDatabase userDatabase;
    private User user;

    @BeforeEach
    public void setUp() {
        userDatabase = UserDatabase.getInstance();
        user = new User("John", "Doe", "john@example.com", "password123", 25, "1998-05-14", "Music", "Movies");
        userDatabase.addUser("John", "Doe", "john@example.com", "password123", 25, "1998-05-14", "Music", "Movies");
    }

    @Test
    public void testAddUser() {
        User foundUser = userDatabase.findUserByEmail("john@example.com");
        assertNotNull(foundUser);
        assertEquals("John", foundUser.getFirstName());
        assertEquals("Doe", foundUser.getLastName());
    }

    @Test
    public void testFindUserByEmail() {
        User foundUser = userDatabase.findUserByEmail("john@example.com");
        assertNotNull(foundUser);
    }

    @Test
    public void testSearchUsers() {
        List<User> searchResults = userDatabase.searchUsers("John Doe");
        assertFalse(searchResults.isEmpty());
        assertEquals("John", searchResults.get(0).getFirstName());
        assertEquals("Doe", searchResults.get(0).getLastName());
    }

    @Test
    public void testAddPost() {
        userDatabase.addPost(user, user, "Hello, this is a test post!");
        List<String> posts = userDatabase.getPosts(user);
        assertTrue(posts.contains("John: Hello, this is a test post!"));
    }
}
