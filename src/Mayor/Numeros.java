package Mayor;

public class Numeros {
	 int numero_mayor(int a, int b, int c) {
		 if (a > b && a > c) {
	     return a;
	     } else if (c > b) {
	     return c;
	     } else {
	     return b;
	     }
	 }
	 
	 int numero_menor(int a, int b, int c) {
		 if (a < b && a < c) {
	     return a;
	     } else if (c < b) {
	     return c;
	     } else {
	     return b;
	     }
	 }
	 
	 boolean numero_par(int numero) {
		 if(numero%2==0) {
			return true;
		 }else {
			 return false;
		 }
	 }
	 
	 boolean numero_impar(int numero1) {
		 if(numero1%2!=0) {
			 return true;
		 }else {
			 return false;
		 }
	 }
}
