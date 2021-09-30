import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTest {
	
	@Test
    public void case01(){
        // Arrange
        Hello hello = new Hello();
        String expected = "Hello Sarun";
        
        // Act
        String actual = hello.say("Sarun");
        
        // Assert = Then
        assertEquals(expected, actual);    }

}
