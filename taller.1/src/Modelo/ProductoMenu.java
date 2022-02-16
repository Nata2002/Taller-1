package Modelo;

public class ProductoMenu implements Producto
{

	//Atributos
	
	private String nombre;
	
	private int precioBase;
	
	
	//Constructor
	
	public ProductoMenu (String nombre, int precioBase) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	
	//Métodos
	
	
	/**
	 * Retorna el precio
	 */
	public int getPrecio() 
	{
		return precioBase;
	}


	/**
	 * Retorna el nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}


	/**
	 * Genera el texto factura
	 */
	public String generarTextoFactura() 
	{
		return nombre+" : $"+precioBase;
	}


}