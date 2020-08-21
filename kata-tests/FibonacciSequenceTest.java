import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

	@Test
	void sanityTest() {

		Assertions.assertTrue(2 + 2 == 5);
	}
}

/*
# The Fibonacci Sequence Kata #

Source: Jason Gorman ([Codemanship](http://codemanship.co.uk/tdd.html))

Write a C# script that writes out the number for a given position in the Fibonacci Sequence

## Example ##

Given the sequence

    0
    1
    1
    2
    3
    5
    8
    13
    21
    34

Supplying position 5 would print 3
 */