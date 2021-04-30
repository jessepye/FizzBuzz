import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        // Setup
            String[] expected = {"FizzBuzz", "1", "2", "Fizz", "4", "Buzz"};
        // Execute

        // Test
        for (int i = 0; i < 6; i++) {
            assertEquals(expected[i], FizzBuzz.FizzBuzz(i));
        }
    }
}