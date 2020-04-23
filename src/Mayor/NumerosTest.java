package Mayor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumerosTest {

	@Test
	void testNumero_mayor() {
	System.out.println("Número mayor");
	int a = 5;
	int b = 2;
	int c = 9;
	Numeros instance = new Numeros();
	int esperado = 9;
	int obtenido = instance.numero_mayor(a, b, c);
	assertEquals(esperado, obtenido);
	//fail("Not yet implemented");
	}
	
	@Test
	void testNumero_menor() {
	System.out.println("Número menor");
	int a = 4;
	int b = 3;
	int c = 9;
	Numeros instance = new Numeros();
	int esperado = 3;
	int obtenido = instance.numero_menor(a, b, c);
	assertEquals(esperado, obtenido);
	//fail("Not yet implemented");
	}
	
	@Test
	void testNumero_par() {
		System.out.println("Número par");
		int numero = 2;
		Numeros instance = new Numeros();
		boolean esperado = true;
		boolean obtenido = instance.numero_par(numero);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testNumero_impar() {
		System.out.println("Número impar");
		int numero = 3;
		Numeros instance = new Numeros();
		boolean esperado = true;
		boolean obtenido = instance.numero_impar(numero);
		assertEquals(esperado, obtenido);
	}
}
