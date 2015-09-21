package tuition;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalTutionTest {

	@Test
	public void test_calc_tuition() {
		TotalTuition myTuition = new TotalTuition();
		
		assertTrue(TotalTuition.calc_tuition(0, 0, 0) == 0);		
		assertTrue(TotalTuition.calc_tuition(4, 0.05, 10000) == 90458.8125);
		System.out.print(TotalTuition.calc_tuition(4, 0.05, 10000));
		
		/** I couldn't figure out why this was evaluating differently than I had calculated.
		 * I tried using a print statement to see what was printing here but it wasn't showing
		 * up in the console.
		 */
	}

}
