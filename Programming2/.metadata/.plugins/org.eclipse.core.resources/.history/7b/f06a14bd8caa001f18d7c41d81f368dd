package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraderTest {

	
	@Test
	void ninetyShouldReturnA() {
		Grader grader = new Grader();
		assertEquals('A', grader.determineLetterGrade(90));
	}
	@Test
	void eightyShouldReturnB() {
		Grader grader = new Grader();
		assertEquals('B', grader.determineLetterGrade(80));
	}
	@Test
	void seventyShouldReturnC() {
		Grader grader = new Grader();
		assertEquals('C', grader.determineLetterGrade(70));
	}
	@Test
	void sixtyShouldReturnD() {
		Grader grader = new Grader();
		assertEquals('D', grader.determineLetterGrade(60));
	}
	@Test
	void fiftyNineShouldReturnC() {
		Grader grader = new Grader();
		assertEquals('F', grader.determineLetterGrade(59));
	}
	@Test
	void negativeOneShouldReturnIllegalArgumentExceprion() {
		Grader grader = new Grader();
		assertThrows(IllegalArgumentException.class, () -> {grader.determineLetterGrade(-1);});
	}

}
