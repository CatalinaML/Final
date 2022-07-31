package Clases;

public class Camioneta extends Vehiculo{

	private boolean cajaCerrada;
	private boolean farosAntiniebla;
	public Camioneta(String patente, String marca, String modelo, String anioFabricacion, String color, boolean cajaCerrada, boolean farosAntiniebla) {
		super(patente, marca, modelo, anioFabricacion, color);
		this.cajaCerrada = cajaCerrada;
		this.farosAntiniebla = farosAntiniebla;
	}
	public boolean isCajaCerrada() {
		return cajaCerrada;
	}
	public boolean isFarosAntiniebla() {
		return farosAntiniebla;
	}
	@Override
	public String toString() {
		return super.toString() + "Camioneta [cajaCerrada=" + cajaCerrada + ", farosAntiniebla=" + farosAntiniebla + "]";
	}

}
