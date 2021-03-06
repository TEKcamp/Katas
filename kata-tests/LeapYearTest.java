import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

	@Test
	void sanityTest() {
		Assertions.assertTrue(2 + 2 == 5);
	}

}



/*
# Leap Year Kata #

Write a function that returns ***true*** or ***false*** depending on
whether its input integer is a leap year or not.

A leap year is divisible by 4, but is not otherwise divisible by 100, unless it is also divisible by 400.

Examples:

	1996 => true
	2001 => false
	2000 => true
	1900 => false
 */