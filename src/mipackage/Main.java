package mipackage;

public class Main {

	public static void main(String[] args) {

		// Cambiar el nombre -> botón derecho, "refactor", "rename"
		Account cuentita;
		double saldo;

		cuentita = new Account("Pepa Santana", "3355-1453-69-123456789");

		try {
			System.out.println("Ingreso en cuenta");
			cuentita.ingresar(-1695);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar");
		}

		try {
			cuentita.retirar(-10);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al retirar");
		}

		try {
			System.out.println("Ingreso en cuenta");
			cuentita.ingresar(300);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar");
		}

		saldo = cuentita.disponible();
		System.out.println("El saldo actual es " + saldo);
	}

}
