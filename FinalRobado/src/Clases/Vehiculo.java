package Clases;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private String anioFabricacion;
	private String color;
	private String patente;
	
	public Vehiculo(String patente, String marca, String modelo, String anioFabricacion, String color) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", color="
				+ color + ", patente=" + patente + "]";
	}
	
	
}
