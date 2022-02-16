package Consola;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;

import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Restaurante;



public class consolaHamburguesas 
{


	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	private void ejecutarOpcion(int opcion)
	{
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				
				if (opcion == 1)
					Restaurante.getMenuBase();
				else if (opcion == 2) 
				{
					String nom = input("Por favor ingrese su nombre: ");
				    String direccion = input("Por favor ingrese su direccion: ");
					Restaurante.iniciarPedido(nom, direccion);
				}
				else if (opcion == 3) {
			
					String nom = input("Por favor ingrese el nombre del producto: ");
					Producto prod= 
					Pedido.agregarProducto(prod);
				}
				else if (opcion == 4) {
					Pedido.guardarFactura();
				    System.out.println("Saliendo de la aplicacion ..., gracias por su compra.");
					continuar = false;}
				else if (opcion == 5)
					ejecutarOpcion(opcion_seleccionada);
				
				else
				{
					System.out.println("Por favor seleccione una opcion valida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los numeros de las opciones.");
			}
		
	}
	private void ejecutarCargarRestaurante()
	{
		System.out.println("\n" + "Cargar informacion del restaurante" + "\n");
		

		try
		{
			Restaurante.cargarInformacionRestaurante();
			System.out.println("Se cargaron los archivos " + archivo + " con informacion del restaurante.");
	
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}

	}
	public void mostrarMenu()
	{
		System.out.println("Bienvenido a su tienda de Hamburguesas \n");
			System.out.println("\nOpciones de la aplicacion\n");
			System.out.println("1. Mostrar el menu");
			System.out.println("2. Iniciar un nuevo pedido");
			System.out.println("3. Agregarle un elemento al pedido");
			System.out.println("4. Cerrar pedido y guardar factura");
			System.out.println("5. Consultar informacion de un pedido");
			
			{
				ejecutarCargarRestaurante();
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opcion"));
				ejecutarOpcion(opcion_seleccionada);
			}	
	}	
		public static void main(String[] args)
		{
			consolaHamburguesas consola = new consolaHamburguesas();
			consola.mostrarMenu();
		}         
	}