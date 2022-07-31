package Clases;

public class Auto extends Vehiculo{

	private int cantPuertas;

	public Auto(String patente, String marca, String modelo, String anioFabricacion, String color, int cantPuertas) {
		super(patente, marca, modelo, anioFabricacion, color);
		this.cantPuertas = cantPuertas;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + "Auto [cantPuertas=" + cantPuertas + "]";
	}
}
