import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciGeneratorTest {

	@Test
	void sanityTest() {

		Assertions.assertTrue(2 + 2 == 5);
	}
}

/*
# Fibonacci Generator Kata #

Write some code to generate the Fibonacci sequence up to a specific length which is no shorter than 8 numbers and no longer than 50

	F0 => 0
	F1 => 1
	F2 => 1
	F3 => 2
	F4 => 3
	F5 => 5
	F6 => 8
	F7 => 13
	F8 => 21

The Rule is  Xn = Xn-1 + Xn-2

    i.e. Fibonacci(number - 1) + Fibonacci(number - 2)
 */