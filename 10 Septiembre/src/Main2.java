import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el número a evaluar");
		int numero = lector.nextInt();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
