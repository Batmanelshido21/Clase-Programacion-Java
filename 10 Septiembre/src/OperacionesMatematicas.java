import java.util.Scanner;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		boolean bandera=true;
		
		while(bandera==true) {
			System.out.println("Introduce la operación a realizar /n 1: Factorial /n 2:Fibonacci");
			int opcion =0;
			switch(opcion) {
				case 1:
					System.out.println("Introduce el número a evaluar");
					int num = lector.nextInt();

					int resultado=num;
					
					for(int i=num;i>2;i--) {
						resultado=resultado*(i-1);
						System.out.println(resultado);
					}
					System.out.println("El resultado del factorial es "+resultado);
					break;
				case 2:
					
					break;
			}
			
			System.out.println("Desea seguir realizando la operación");
			bandera=lector.nextBoolean();
			
		}
	}

}


