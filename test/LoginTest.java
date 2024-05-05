import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testIsValidLogin() {
        Login login = new Login();
        assertTrue(login.isValidLogin("Admin", "2100401"));
        assertFalse(login.isValidLogin("invalidUsername", "invalidPassword"));
    }

    @Test
    public void testGetUserRole() {
        Login login = new Login();
        assertEquals("Admin", login.getUserRole("Admin"));
        assertNull(login.getUserRole("nonExistingUser"));
    }
}
