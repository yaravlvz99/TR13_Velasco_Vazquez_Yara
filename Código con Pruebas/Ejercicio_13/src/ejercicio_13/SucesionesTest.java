package ejercicio_13;

import static org.junit.Assert.*;

import org.junit.Test;

public class SucesionesTest {

	@Test
	public void testFibonacci() {
		Sucesiones fibo = new Sucesiones();
		String posicion = fibo.Fibonacci(3);
		assertEquals("0,1,1", posicion);
	}

}
