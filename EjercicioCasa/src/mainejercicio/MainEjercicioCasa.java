package mainejercicio;

import java.util.ArrayList;

import clasesenum.TipoHabitacion;
import clasesenum.TipoVia;
import entidades.Casa;
import entidades.Direccion;
import entidades.Habitacion;
import entidades.Persona;

public class MainEjercicioCasa {

	public static void main(String[] args) {

		Direccion d1 = new Direccion(TipoVia.Avenida, "Avenida 1", 11, "28600");
		Direccion d2 = new Direccion(TipoVia.Glorieta, "Glorieta 2", 22, "28656");
		Direccion d3 = new Direccion(TipoVia.Calle, "Calle 3", 33, "28700");
		Direccion d4 = new Direccion(TipoVia.Pasaje, "Pasaje 4", 44, "28900");
		Direccion d5 = new Direccion(TipoVia.Avenida, "Avenida 5", 55, "28950");

		Persona p1 = new Persona("Santiago Torres", "123A", "654321", d1);
		Persona p2 = new Persona("Carmen García", "123B", "654333", d2);
		Persona p3 = new Persona("Alejandra Ochoa", "123C", "654444", d3);
		Persona p4 = new Persona("Alfredo Pérez", "123D", "654888", d4);

		Habitacion h1 = new Habitacion(TipoHabitacion.Baño, 10.5);
		Habitacion h2 = new Habitacion(TipoHabitacion.Comedor, 15);
		Habitacion h3 = new Habitacion(TipoHabitacion.Cocina, 20);
		Habitacion h4 = new Habitacion(TipoHabitacion.Dormitorio, 12.2);

		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h3);
		listaHabitaciones.add(h4);

		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		listaInquilinos.add(p2);
		listaInquilinos.add(p3);
		listaInquilinos.add(p4);

		Casa c = new Casa(p1, 1500, d5, listaHabitaciones, listaInquilinos);
		System.out.println(c);
		System.out.println("Metros cuadrados: " + c.calcularM2());
	}
}
