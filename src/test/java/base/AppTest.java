/*
 *  UCF COP3330 Summer 2021 Exercise 22 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    static App myApp = new App();

    @Test
    public void output_should_detect_duplicate_number()
    {
        int[] myNumbers = new int[3];

        myNumbers[0] = 51;
        myNumbers[1] = 1;
        myNumbers[2] = 51;

        boolean actualOutput = myApp.checkDuplicateEntries(myNumbers);

        assertFalse(actualOutput);
    }

    @Test
    public void output_should_not_find_duplicate_number()
    {
        int[] myNumbers = new int[3];

        myNumbers[0] = 51;
        myNumbers[1] = 1;
        myNumbers[2] = 3;

        boolean actualOutput = myApp.checkDuplicateEntries(myNumbers);

        assertTrue(actualOutput);
    }
}