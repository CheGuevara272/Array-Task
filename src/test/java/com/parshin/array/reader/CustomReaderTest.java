package com.parshin.array.reader;

import com.parshin.array.exception.CustomException;
import com.parshin.array.reader.impl.CustomReaderImpl;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.Arrays;
import java.util.List;

public class CustomReaderTest {
    public static final String correctFileName = "data/numbers.txt";
    public static final String incorrectFileName = "incorrectFileName.txt";

    public CustomReaderImpl customReader = CustomReaderImpl.getInstance();

    @Test
    public void readFilePositiveTest() throws CustomException {
        List<String> expected = Arrays.asList("5         13 3  34  64 56 4 2  23               11           -5          -4       33 7",
                " 563    -345      1       235423     2235       -5456 24353 -333453             2 1",
                "     100 3 -2     4 7    25",
                " -63 -12345678901234      -6 232  423 12345678901234");
        List<String> actual = null;
        try {
            actual = customReader.readFile(correctFileName);
        } catch (CustomException e) {
            fail();
        }
        
        assertEquals(actual, expected);
    }

    @Test
    public void readFileNegativeTest() throws CustomException {
        assertThrows(CustomException.class, () -> customReader.readFile(incorrectFileName));
    }
}
