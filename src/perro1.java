
import java.util.Scanner;

public class perro1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Perro perro1 = new Perro();

		

		Perro perro2 = new Perro("Petunia", "Mastin tibetano");

		String respuesta = "";

		System.out.println("Como se llama tu perro:");

		perro1.setNombre(sc.nextLine());

		System.out.println("Enhorabuena, este es tu perro: " + perro1);

		System.out.println("Oye, hay un " + perro2.getRaza() + " llamado " + perro2.getNombre()
				+ "...¿Quieres reporducirte? [y/n]");
		respuesta = sc.nextLine();
		System.out.println();

		if (respuesta.equals("y")) {

			if (perro1.tryReproduction(perro2) == true) {
				System.out.println("La reproducción ha sido efectiva, capitan");

				System.out.println("cargando bebé...");

				// SIRVE PARA QUE EL SISTEMA ESPERA LA CANTIDAD DE MILISEGUNDOS ESPECIFICADA!!!!

				try {
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}

				System.out.println("El bebe es: " + perro1.getbebe());

			} else
				System.out.println("Has fallado...para la próxima");
		} else if (respuesta.equals("n"))
			System.out.println("Bueno cuando quieras ;)");

	}
}
