package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ProductoAjustado implements Producto
{

	//Producto base del menu
	private ProductoMenu base;
	
	//Lista de ingredientes agregados al producto
	private List<Ingrediente> agregados;
	
	//Lista de ingredientes eliminados del producto
	private List<Ingrediente> eliminados;
	
	
	
	//Constructor
	
	public ProductoAjustado(ProductoMenu base) 
	{
		this.base = base;
		agregados = new ArrayList<Ingrediente>();
		eliminados = new ArrayList<Ingrediente>();
	}
	
	
	
	//Métodos
	
	/**
	 * Retorna el precio al sumar el precio base más el precio de cada adición
	 */
	public int getPrecio() {
		int precioBase = base.getPrecio();
		int precioExtra = 0;
		for (Ingrediente productoExtra : agregados) 
		{
			precioExtra += productoExtra.getCostoAdicional();
		}
		return precioBase + precioExtra;
	}

	
	/**
	 * Retorna el nombre del producto base junto a las adiciones y los elementos eliminados
	 */
	public String getNombre() 
	{
		String cadena = base.getNombre();
		for (Ingrediente productoExtra : agregados) 
		{
			cadena += " con adición de : "+productoExtra.getNombre();
		}
		for (Ingrediente productoExtra : eliminados) 
		{
			cadena += " sin : "+productoExtra.getNombre();
		}
		return cadena;
	}

	
	/**
	 * Genera el texto de la factura con las adiciones y eliminados
	 */
	public String generarTextoFactura() 
	{
		String factura = base.generarTextoFactura();
		for (Ingrediente productoExtra : agregados) 
		{
			factura += "\nAdición de : "+productoExtra.getNombre()+" : $"+productoExtra.getCostoAdicional();
		}
		for (Ingrediente productoExtra : eliminados) 
		{
			factura += "\nSin : "+productoExtra.getNombre();
		}
		return factura;
	}


	/**
	 * Agrega un ingrediente al producto
	 */
	public void agregarIngrediente(Ingrediente nuevoIngrediente) 
	{
		agregados.add(nuevoIngrediente);
	}


	/**
	 * Elimina un ingrediente del producto
	 */
	public void eliminarIngrediente(Ingrediente nuevoIngrediente) 
	{
		eliminados.add(nuevoIngrediente);
	}

}