package Excepciones;

public class RepetidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String elementoRepetido;
	
	public RepetidoException(String mensaje, String repetido) {
		super(mensaje);
		elementoRepetido = repetido;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage() + "elemento repetido: " + elementoRepetido;
	}
}
