
import java.util.Scanner;

public class perro1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Perro perro1 = new Perro();

		Perro perro2 = new Perro("Petunia", "Mastin tibetano");

		Perro perroBebe = null;

		String respuesta = "";

		int aleatoreidad = (int) (Math.random() * 100);

		System.out.println("Como se llama tu perro:");

		perro1.setNombre(sc.nextLine());

		System.out.println("Enhorabuena, este es tu perro: " + perro1);
		
		System.out.println("...");

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

				perroBebe = perro1.getbebe();

				System.out.println("El bebe es: " + perroBebe);

			} else
				System.out.println("Has fallado...para la próxima");
		} else if (respuesta.equals("n"))
			System.out.println("Bueno cuando quieras ;)");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("....................");

		System.out.println("¿Que te gustaría hacer ahora?");
		
		System.out.println();

		System.out.println("Jugar a la pelota[1], ir a morder gente[2] o echarte[3]");
		int num = sc.nextInt();
		
		System.out.println();

		switch (num) {

		case 1: {
			System.out.println("El dia es bonitoo");
			if (perroBebe != null)
				System.out.println(perroBebe.getNombre() + " se divierte mucho jugando a la pelota");

			else
				System.out.println("¿Cómo se supone que vas a jugar solo?");
			
			System.out.println("Te pones a dar vueltas sin sentido");

			break;
		}

		case 2: {
			if (aleatoreidad > 50) {
				System.out.println("CREO QUE ACABAS DE MORDER A ALGUIEN, CORRE !!");

				if (aleatoreidad > 60) {
					perro1.setHerido();
					System.out.println("Te caiste corriendo y ahora estás herido :c");
					
					

				}
				
				if (perroBebe != null) {
					
					System.out.println(perroBebe.getNombre() + " Corre contigo, pobrecito. Mira el caos que has desatado!");
				}
				
			} else {
				System.out.println("Hiciste mordiscos en modo sigilo y nadie se entero..El día sigue");
			}

			break;
		}

		case 3: {

			System.out.println("Te echas una siesta, vago");
			break;
		}
		}
		
		System.out.println();
		System.out.println("***** tres horas más tarde ****");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
		
		if (perro1.estaHerido() && perroBebe != null){
			
			System.out.println("Sabes que estás herido, pero no te atreves a decirle nada a "+ perroBebe.getNombre()+ ", solo quieres verlo feliz,verlo " + perroBebe.getGusto());
			
			System.out.println(perroBebe.getNombre()+ " te mira, ves el pesar en su mirada.");
		}
		else if (perro1.estaHerido() && perroBebe == null) {
			System.out.println("Sabes que estás herido, intentas no pensar en "+ perro2.getNombre()+ ", solo quieres verla feliz,verla " + perro2.getGusto());
		}
		
		else {
			
			if (!perro1.estaHerido() && perroBebe == null) {
				
				System.out.println("Pasaste un dia tranquilo");
				
				System.out.println("CUANDO DE PRONTO  BJUUUUUUUUUUUM PSSSSSSSSSSSSSSSSAAAASSSH!!");
				
				System.out.println("Has sido atropellado por un camion de Wells Fargo, GAME OVER");
			}
			
		}
		

	}/////////////////// Fin main////////////////////////
}
