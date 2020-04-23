import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName(value = "Multiplicamos (3 + 2j)4.5")
	void testMultiplicarDouble() {
		Complex numA = new Complex(3,2);
		double numB = 4.5;
		Complex obtenido = numA.multiplicar(numB);
		Complex esperado = new Complex(13.5, 9);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	@DisplayName(value = "Realiza esta operación: (3+j)*((2+5j)+(4-7j))")
	void testSumaYMultiplicacion() {
		Complex s1 = new Complex(2,5);
		Complex s2 = new Complex(4,-7);
		Complex f = new Complex(3,1); 
		Complex aux = s1.sumar(s2); //Debe dar (6, -2)
		//(6, -2) * (3,1) = (6*3 - (-2)*1, 6*1 + (-2)*3)
		Complex obtenido = f.multiplicar(aux); //Debe dar (...)
		Complex esperado = new Complex(20,0);
		//(15,5);
		assertEquals(esperado, obtenido);
	}
}
