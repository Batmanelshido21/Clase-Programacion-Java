import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		boolean bandera=true;
		
		while(bandera==true) {
			
			System.out.println("Introduce algún número entero");
			int numeroEntero = lector.nextInt();
			char caracter = 'Z';
			System.out.println("Introduce un número fracción");
			double fraccion = lector.nextDouble();
			System.out.println("Introduce la cadena a mostrar");
			lector.nextLine();
			String cadena = lector.nextLine();
			

			System.out.println(cadena + " El número entero fue " + numeroEntero + " El caracter fue " + caracter
					+ " y la fraccion fue " + fraccion + " el número mas 10 es "+(numeroEntero+10));
			
			if(numeroEntero<100&&numeroEntero>10) {
				System.out.println("Entramos al condicional de &&");
			}
			if(numeroEntero>100||numeroEntero>10) {
				System.out.println("Entramos al condicional de ||");
			}
			
			System.out.println("Desea seguir realizando la operación");
			bandera=lector.nextBoolean();
			
		}

	}

}
