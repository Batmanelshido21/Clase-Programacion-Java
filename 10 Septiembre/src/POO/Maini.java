package POO;

import java.util.ArrayList;
import java.util.Scanner;

import Modelos.Cuenta;
import Modelos.Gerente;
import Modelos.Intendente;
import Modelos.TrajetaCredito;

public class Maini {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
		
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el número de gerentes a registrar");
		int numGerentes = lector.nextInt();
		
		int idGerente=0;
		String nombreGerente="";
		int edadGerente=0;
		String puesto="";
		
		
		for(int i=0;i<numGerentes;i++) {
			
			System.out.println("Introduce el id");
			idGerente=lector.nextInt();
			System.out.println("Introduce el nombre de gerente");
			nombreGerente=lector.nextLine();
			nombreGerente=lector.nextLine();
			System.out.println("Introduce la edad");
			edadGerente=lector.nextInt();
			System.out.println("Introduce el puesto");
			lector.next();
			puesto=lector.nextLine();
			
			Gerente gerente = new Gerente(idGerente,nombreGerente,edadGerente,puesto);
			gerentes.add(gerente);
			
		}
		
		for(int i =0;i<gerentes.size();i++) {
			System.out.println(gerentes.get(i).toString());
		}
		
		Cuenta cuenta = new Cuenta("correotemporal@gmail.com","passwordPrueba",gerentes.get(0));
		gerentes.get(0).setCuenta(cuenta);
		
		
		System.out.println("La cuenta de gerente es "+gerentes.get(0).getCuenta().toString());
		System.out.println("El gerente de la cuenta con correo "+ cuenta.getCorreo()+ " es "+ cuenta.getGerente().toString());
		
		
		ArrayList<TrajetaCredito> tarjetas = new ArrayList<TrajetaCredito>();
		
		System.out.println("Introduce el número de tarjetas");
		int numTarjetas = lector.nextInt();
		
		String numeroTarjeta="";
		int ccv=0;
		String fecha="";
	
		for(int i=0;i<numTarjetas;i++) {
			System.out.println("introduce el número de tarjeta");
			numeroTarjeta = lector.nextLine();
			numeroTarjeta = lector.nextLine();
			System.out.println("ccv");
			ccv = lector.nextInt();
			System.out.println("fecha");
			fecha = lector.nextLine();
			fecha = lector.nextLine();
			TrajetaCredito tarjeta = new TrajetaCredito(numeroTarjeta,ccv,fecha,gerentes.get(0));
			tarjetas.add(tarjeta);
			
		}
		
		for(int i=0;i<tarjetas.size();i++) {
			System.out.println("El dueño de la tarjeta de la posicion "+i+ " es "+tarjetas.get(i).getGerente().toString());
		}
		
		
		
	}

}
