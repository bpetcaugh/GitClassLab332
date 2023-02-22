package StudentFiles;

import org.junit.Test;

import static StudentFiles.LainaNguyen.fizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

public class LainaNguyenTest {

    @Test
    public void fizzBuzzTest1() {
        assertEquals("Fizz", fizzBuzz(6));
    }
}