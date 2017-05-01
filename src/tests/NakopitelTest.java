package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import form.Calculation;
public class NakopitelTest {

	@Test
	public void test() {
		int deposit = 30000,  percent = 12, periodicity = 1, ammount = 1000,
				days = 365;
		int s;
		s = Calculation.calc_n(deposit,percent, periodicity, ammount, days);
		int tests = 47040;
		assertEquals(tests,s);
	}

}
