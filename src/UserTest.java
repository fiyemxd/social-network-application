import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;
    private User friend;

    @BeforeEach
    public void setUp() {
        user = new User("John", "Doe", "john@example.com", "password123", 25, "1998-05-14", "Music", "Movies");
        friend = new User("Jane", "Smith", "jane@example.com", "password456", 30, "1993-08-22", "Books", "Travel");
    }

    @Test
    public void testAddFriend() {
        user.getFriends().add(friend);
        assertTrue(user.getFriends().contains(friend));
    }

    @Test
    public void testUpdateNotifications() {
        String notification = "New post on your wall!";
        user.update(notification);
        assertTrue(user.getNotifications().contains(notification));
    }

    @Test
    public void testGetFullName() {
        String fullName = user.getFirstName() + " " + user.getLastName();
        assertEquals("John Doe", fullName);
    }
}
