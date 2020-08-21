import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {
	@Test
	void sanityTest() {

		Assertions.assertTrue(2 + 2 == 5);
	}
}


/*
# Word Counter Kata #

A method that, given a delimited string, returns a collection of all of the
unique words in it and the count of how many times they occurred.
Start off with a space between words, but later other delimiters wil
be added.

Example input:

	"boom,bang,boom"

Which would produce the following result:

	boom, 2
	bang, 1
 */