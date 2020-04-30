import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest2 {
//Este es mi primer comentario desde GitHub
	@Test
	@DisplayName(value = "Suma de (2+3j)+(4+j)=(6+4j)")
	void testSumar() {
		Complex numA = new Complex(2,3);
		Complex numB = new Complex(4,1);
		Complex esperado = new Complex(6,4);
		Complex obtenido = numA.sumar(numB);
		assertEquals(esperado, obtenido);
		//fail("Not yet implemented");
	}
//Segundo comentario desde GitHub
	@Test
	@DisplayName(value = "Resta de (7+9j)-(6+5j)=(1+4j)")
	void testRestar() {
		Complex numA = new Complex(7,9);
		Complex numB = new Complex(6,5);
		Complex esperado = new Complex(1,4);
		Complex obtenido = numA.restar(numB);
		assertEquals(esperado, obtenido);
		//fail("Not yet implemented");
	}
//Comentario desde GitHub
	@Test
	@DisplayName(value = "Multiplicamos números complejos (a, b) * (c, d) = (a*c – b*d, a*d + b*c)")
	void testMultiplicarComplex() {
		Complex numA = new Complex(2,3);
		Complex numB = new Complex(4,3);
		Complex esperado = new Complex(-1,18);
		Complex obtenido = numA.multiplicar(numB);
		assertEquals(esperado, obtenido);
		//fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "Multiplicamos (6 + 3j)2.5")
	void testMultiplicarDouble() {
		Complex numA = new Complex(6,3);
		double numB = 2.5;
		Complex esperado = new Complex(15, 7.5);
		Complex obtenido = numA.multiplicar(numB);
		assertEquals(esperado, obtenido);
		//fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "Dividimos (a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))")
	void testDividir() {
		Complex numA = new Complex(4,2);
		Complex numB = new Complex(2,2);
		Complex esperado = new Complex(1.5, -0.5);
		Complex obtenido = numA.dividir(numB);
		assertEquals(esperado, obtenido);
		//fail("Not yet implemented");
	}
	
	@Test
	@DisplayName(value = "Realiza esta operación: (2+j)*((3+4j)+(4-6j))")
	void testSumaYMultiplicacion() {
		Complex num1 = new Complex(3,4);
		Complex num2 = new Complex(4,-6);
		Complex num3 = new Complex(2,1); 
		Complex aux = num1.sumar(num2); 
		//La suma debe dar (7, -2)
		//(7, -2) * (2,1) = (7*2 - (-2)*1, 7*1 + (-2)*2)
		Complex obtenido = num3.multiplicar(aux);
		Complex esperado = new Complex(16,3);
		assertEquals(esperado, obtenido);
	}
}
