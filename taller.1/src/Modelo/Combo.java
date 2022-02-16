package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto
{

	//Atributos
	
	private String nombreCombo;
		
	private double descuento;
		
	private List<ProductoMenu> productos;
	
		
	//Constructor
		
	public Combo (String nombre, double descuento) 
	{
		nombreCombo = nombre;
		this.descuento = descuento;
		productos = new ArrayList<ProductoMenu>();
	}
		
		
	//Métodos
		
	
	/**
	 * Agrega un producto al menu
	 */
	public void agregarIngrediente(ProductoMenu nuevoProducto) 
	{
		productos.add(nuevoProducto);
	}
	
	
	/**
	 * Retorna el precio con descuento
	 */
	public int getPrecio() 
	{
		int precio = 0;
		for (ProductoMenu producto : productos) 
		{
			precio += producto.getPrecio();
		}
		precio = (int) (precio - (precio*descuento));
		return precio;
	}

	/**
	 * Retorna el nombre
	 */
	public String getNombre() 
	{
		return nombreCombo;
	}

	/**
	 * Genera el texto factura
	 */
	public String generarTextoFactura() 
	{
		return nombreCombo+" : $"+this.getPrecio();
	}


}