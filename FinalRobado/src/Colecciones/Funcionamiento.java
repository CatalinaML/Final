package Colecciones;

import Clases.Vehiculo;

public interface Funcionamiento {

	public boolean agregar(Vehiculo v);
	
	public boolean quitar(String patente);
	
	public String listar();
	
	public boolean comprobarExistencia(Vehiculo v);
}
