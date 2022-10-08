package Modelos;

public class TrajetaCredito {
	
	private String numTarjeta;
	
	private int ccv;
	
	private String fecha;
	
	private Gerente gerente;

	public TrajetaCredito(String numTarjeta, int ccv, String fecha, Gerente gerente) {
		super();
		this.numTarjeta = numTarjeta;
		this.ccv = ccv;
		this.fecha = fecha;
		this.gerente = gerente;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}
	
	

	public Gerente getGerente() {
		return gerente;
	}

	@Override
	public String toString() {
		return "TrajetaCredito [numTarjeta=" + numTarjeta + ", ccv=" + ccv + ", fecha=" + fecha + "]";
	}
	

}
