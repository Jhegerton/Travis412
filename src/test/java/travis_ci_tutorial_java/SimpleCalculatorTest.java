package travis_ci_tutorial_java;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;


public class SimpleCalculatorTest {
	final int SUM = 2;
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), SUM );
	}
}
