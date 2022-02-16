package Modelo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Pedido 
{

	
	//Atributos
	
	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	private List<Producto> productos;
	
	
	//Constructor
	
	public Pedido(String nombreCliente, String direccionCliente) 
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		productos = new ArrayList<Producto>();
	}


	
	public int getIdPedido() 
	{
		return idPedido;
	}
	
	
	public void agregarProducto(Producto nuevoItem) 
	{
		productos.add(nuevoItem);
	}


	private int getPrecioNetoPedido()
	{
		int precio = 0;
		for (Producto productoActual : productos) 
		{
			precio += productoActual.getPrecio();
		}
		return precio;
	}
	
	private int getPrecioTotalPedido()
	{
		return this.getPrecioNetoPedido() + this.getPrecioIVAPedido();
	}
	
	private int getPrecioIVAPedido()
	{
		return (int) (this.getPrecioNetoPedido()*0.19);
	}
	
	private String generarTextoFactura()
	{
		String factura = "";
		factura += "Nombre cliente : "+ this.nombreCliente;
		factura += "\nDirección cliente : "+ this.direccionCliente+"\n";
		for (Producto productoActual : productos) 
		{
			factura += productoActual.generarTextoFactura()+"\n";
		}
		factura += "\nPrecio sin IVA : "+ this.getPrecioNetoPedido();
		factura += "\nPrecio del IVA : "+ this.getPrecioIVAPedido();
		factura += "\nPrecio total : "+ this.getPrecioTotalPedido();
		return factura;
	}
	
	public void guardarFactura(File archivo)
	{
		
		
	}
}