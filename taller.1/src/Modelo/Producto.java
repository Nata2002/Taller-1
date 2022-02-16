package Modelo;

public interface Producto 

{

	/**
	 * Retorna el precio
	 */
	public int getPrecio();
	
	/**
	 * Retorna el nombre
	 */
	public String getNombre();
	
	/**
	 * Genera el texto de factura
	 */
	public String generarTextoFactura();
	
	
}