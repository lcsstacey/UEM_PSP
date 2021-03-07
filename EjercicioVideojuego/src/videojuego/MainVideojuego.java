package videojuego;

import java.util.Scanner;
import java.lang.System;

public class MainVideojuego {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ARMAS

		Arma rezo = new Rezos();
		rezo.setTipo("Rezo 1");

		Arma espada1 = new Espada();
		espada1.setTipo("AAA");

		// PERSONAJES

		Curandero c1 = new Curandero();
		c1.setVida(100);
		c1.setArma(espada1);
		c1.setSabiduria(87);

		Curandero c2 = new Curandero();
		Arma rezo2 = new Rezos();
		rezo.setTipo("Rezo 2");
		c2.setVida(100);
		c2.setArma(rezo2);
		c2.setSabiduria(22);

		Mago m1 = new Mago();
		m1.setNombre("Mago 1");
		m1.setVida(100);
		m1.setArma(espada1);
		m1.setInteligencia(34);

		// INICIO PARTIDA

		boolean continuar = true;
		String cont = "";
		int huida = 0;

		Personaje j1 = c1;
		Personaje j2 = c2;

		System.out.println(
				"--------------------------------------------------------------------------------------------");
		//System.out.println("			⚔⚔⚔	  BATALLA 	⚔⚔⚔");
		titulo();
		System.out.println(
				"\n--------------------------------------------------------------------------------------------");
		System.out.print("🛡  Jugador 1 🛡: ");
		String jugador1 = sc.nextLine();
		j1.setNombre(jugador1);

		System.out.print("⚜ Jugador 2 ⚜: ");
		String jugador2 = sc.nextLine();
		j2.setNombre(jugador2);

		while (continuar) {

			if (j1.getVida() <= 0 || j2.getVida() <= 0) {
				continuar = false;
			} else {
				System.out.println(
						"\n--------------------------------------------------------------------------------------------");
				System.out.println("\n🛡  JUGADOR 1: " + j1.getNombre() + " 🛡");
				System.out.print(j1.getNombre() + " pulsa cualquier tecla para atacar (o pulsa X para salir)\n");
				cont = sc.nextLine();

				if (cont.equalsIgnoreCase("x")) {
					continuar = false;
					huida = 1;

				} else {
					j1.atacar(j2);
					System.out.println();
					System.out.println(j1);
					System.out.println(j2);

					if (j2.getVida() <= 0) {
						continuar = false;

					} else {

						System.out.println(
								"\n--------------------------------------------------------------------------------------------");
						System.out.println("\n⚜  JUGADOR 2: " + j2.getNombre() + " ⚜");
						System.out
								.print(j2.getNombre() + " pulsa cualquier tecla para atacar (o pulsa X para salir)\n");
						cont = sc.nextLine();

						if (cont.equalsIgnoreCase("x")) {
							continuar = false;
							huida = 2;

						} else {
							j2.atacar(j1);
							System.out.println();
							System.out.println(j1);
							System.out.println(j2);

						}
					}
				}

			}
		}

		System.out.println(
				"\n--------------------------------------------------------------------------------------------");
		//System.out.println("			⚔⚔⚔   	  FIN 		⚔⚔⚔");
		finalPartida();
		System.out.println(
				"\n--------------------------------------------------------------------------------------------");

		if (huida == 0) {
			if (j1.getVida() > 0) {
				System.out.println("👑 👑 👑 	El jugador 1 ha ganado la partida	👑 👑 👑");
				System.out.println("		Felicidades " + j1.getNombre());
			} else {
				System.out.println("👑 👑 👑 	El jugador 2 ha ganado la partida	👑 👑 👑");
				System.out.println("		Felicidades " + j2.getNombre());
			}

		} else if (huida == 1) {
			System.out.println("💀💀💀		     El jugador 1 ha huido		💀💀💀");
			System.out.println("👑 👑 👑 		El jugador 2 ha ganado la partida	👑 👑 👑");

		} else if (huida == 2) {
			System.out.println("💀💀💀		     El jugador 2 ha huido		💀💀💀");
			System.out.println("👑 👑 👑 		El jugador 1 ha ganado la partida	👑 👑 👑");
		}
		

		sc.close();
	}
	
	public static void titulo() { 
		System.out.println("\t\t _____  _____  _____  _____  __     __     _____ ");
		System.out.println("\t\t| __  ||  _  ||_   _||  _  ||  |   |  |   |  _  |");
		System.out.println("\t\t| __ -||     |  | |  |     ||  |__ |  |__ |     |");
		System.out.println("\t\t|_____||__|__|  |_|  |__|__||_____||_____||__|__|");
	}
	
	public static void finalPartida() {
		System.out.println("\t\t _____  _____  _____  _____  __ ");
		System.out.println("\t\t|   __||     ||   | ||  _  ||  | ");
		System.out.println("\t\t|   __||-   -|| | | ||     ||  |__ ");
		System.out.println("\t\t|__|   |_____||_|___||__|__||_____|");
	}

}
