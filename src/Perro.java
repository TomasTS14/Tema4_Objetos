
public class Perro {


	private String nombre;
	private String raza;
	private String[] gustosGeneral = { "Coger la pelota", "Comer caca", "Comer comida", "Morder gente",
			"Aullar a las 3 AM" };
	private String gustos;
	private int edad = 0;
	private boolean estaHerido;

	
		



	public Perro() {

	int aux = (int) (Math.random() * gustosGeneral.length);
	
			this.nombre = "Perro";
			this.raza = "Chihuaha";
			this.gustos = gustosGeneral[aux];

		}


	public Perro(String nombre, String raza) {

		int aux = (int) (Math.random() * gustosGeneral.length);

		this.nombre = nombre;
		this.raza = raza;
		this.gustos = gustosGeneral[aux];
	}

	public Perro(String raza, String gusto, int edad) {
		this.nombre = "Perro genérico";
		this.raza = raza;
		this.gustos = gusto;
		this.edad = edad;

	}

	public int getEdad() {
		return this.edad;
	}

	public String getRaza() {
		return this.raza;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getGusto() {
		return this.gustos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGustos(String gustos) {
		this.gustos = gustos;
	}

	public void cumpleAños() {
		this.edad++;
	}

	public boolean estaVivo() {
		int posibilidadVivo = 100;

		if (this.edad > 24 && this.estaHerido)
			posibilidadVivo -= 100;
		else if (this.edad > 24) {
			posibilidadVivo -= 40;
		}
		if (this.edad > 24) {
			for (int i = 24; i <= this.edad; i++) {
				posibilidadVivo -= 20;
			}
		}

		if (posibilidadVivo < 1) {
			return false;
		}

		return true;

	}

	public String queHaceAhora() {
		return this.gustos;
	}

	public void muerde(Perro perroMordido) {
		perroMordido.estaHerido = true;
	}

	public boolean estaHerido() {
		return this.estaHerido;
	}
	
	public void setHerido() {
		 this.estaHerido=true;
	}

	public boolean haMordidoAntes() {
		if (this.gustos.equals(gustosGeneral[3]))
			return true;

		return false;
	}

	public boolean tryReproduction(Perro perroObjetivo) {
		int aux = (int) (Math.random() * 100);

		if (aux > 50)
			return true;

		return false;
	}

	public Perro getbebe() {
		String[] nombres = { "Mat", "Mini", "Alan", "Albuquerque", "Zatura", "McMoney" };
		int aux = (int) (Math.random() * nombres.length);

		Perro perroBebe = new Perro();

		perroBebe.nombre = nombres[aux];
		perroBebe.raza = this.raza;

		return perroBebe;

	}

	@Override

	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", gustos=" + gustos + ", edad=" + edad + "]";
	}
}
