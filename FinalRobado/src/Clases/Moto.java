package Clases;

public class Moto extends Vehiculo{

	private int cantCilindro;
	private boolean conCasco;
	
	public Moto(String patente, String marca, String modelo, String anioFabricacion, String color, int cantCilindros, boolean conCasco) {
		super(patente, marca, modelo, anioFabricacion, color);
		this.cantCilindro = cantCilindros;
		this.conCasco = conCasco;
	}

	public int getCantCilindro() {
		return cantCilindro;
	}

	public boolean isConCasco() {
		return conCasco;
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [cantCilindro=" + cantCilindro + ", conCasco=" + conCasco + "]";
	}

}
