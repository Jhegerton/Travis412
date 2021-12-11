package travis_ci_tutorial_java;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;


public class SimpleCalculatorTest {
	SimpleCalculator calc = new SimpleCalculator();
	int a; int b;
	@Test
	public void testAdd() {
		assertEquals(calc.add(a , b), (a + b));
	}
	public void testSubt() {
		assertEquals(calc.subt(a , b), (a - b));
	}
	public void testMult() {
		assertEquals(calc.mult(a , b), (a * b));
	}
	public void testDiv() {
		assertEquals(calc.div(a , b), (a / b));
	}
}
