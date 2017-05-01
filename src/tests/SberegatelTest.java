package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import form.Calculation;
public class SberegatelTest {

	@Test
	public void test() {
		int deposit = 30000,  percent = 12, days = 365;
		int s;
		s = Calculation.calc_s(deposit,percent,days);
		int tests = 33600;
		assertEquals(tests,s);
	}

}
