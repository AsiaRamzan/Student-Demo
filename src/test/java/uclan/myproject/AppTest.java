package uclan.myproject;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uclan.myproject.App;


public class AppTest {
	  @Test
	    void testGreeting() {
		  App app = new App();
	        assertEquals("Hello CI/CD", app.greet());
	    }

    
}
