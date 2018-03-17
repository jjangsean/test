package calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.code.Calculator;

class Calulator_test {

	@Test
	void testAdd() {
		Calculator cal = new Calculator();
		assertEquals(3,cal.add());
	}

}
