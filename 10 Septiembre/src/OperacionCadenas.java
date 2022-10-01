import java.util.Scanner;

public class OperacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		//String hola = "hola mundo";
		//System.out.println(hola.charAt(3));
		//System.out.println(hola.contains("m"));
		
		System.out.println("Introduce la cadena a evaluar");
		String cadena = lector.nextLine();
		
		char[] arreglo = cadena.toCharArray();
		
		for(int i =0;i<cadena.length();i++) {
			if(arreglo[i]=='a'||arreglo[i]=='e'||arreglo[i]=='i'||arreglo[i]=='o'||arreglo[i]=='u') {
				System.out.println(arreglo[i]);
			}
		}
		System.out.println("==========================");
		
		for(int i=cadena.length()-1;i>=0;i--) {
			
			System.out.println(arreglo[i]);
			
		}
		

	}

}
