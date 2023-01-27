import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void Calculatortest() {
		Calculator calc = new Calculator();
		Double res = calc.evaluate("6 2 3 + *");
		Double expected = 30.0;
		assertEquals(expected, res);
		System.out.println(calc.evaluate("6 2 3 + *"));
	}

}
