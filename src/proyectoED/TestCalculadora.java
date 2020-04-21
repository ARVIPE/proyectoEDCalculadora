package proyectoED;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {

	private Calculadora calculadora;

	public void escenario() {
		calculadora = new Calculadora();
	}

	public void testSumar() {
		escenario();
		assertTrue(calculadora.sumar(2, 2) == (2 + 2));
	}

	public void testRestar() {
		escenario();
		assertEquals(3, calculadora.restar(5, 2));
	}

	public void testMultiplicar() {
		escenario();
		assertTrue(calculadora.multiplicar(2, 2) == (4));
	}

	public void testDividir() {
		escenario();
		assertTrue(calculadora.dividir(2, 2) == (2 / 2));
	}

	public void testEvenNum() {
		escenario();
        assertTrue(calculadora.positivo(2));

    }

}
