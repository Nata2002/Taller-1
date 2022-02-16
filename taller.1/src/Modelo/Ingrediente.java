package Modelo;

public class Ingrediente 
{

	//Atributos
	
	//Nombre Ingrediente
	private String nombre;
	
	//Costo del ingrediente adicional
	private int costoAdicional;
	
	
	//Constructor
	
	public Ingrediente(String nombre, int costoAdicional) 
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	

	
	//Métodos
	
	/**
	 * Retorna el nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}
	
	/**
	 * Retorna el precio del ingrediente adicional
	 */
	public int getCostoAdicional() 
	{
		return costoAdicional;
	}


}