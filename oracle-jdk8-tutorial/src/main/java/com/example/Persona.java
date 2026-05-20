package com.example;

public class Persona extends Object {
	/*
	 * Existen 4 modificadores de acceso para los miembros de una clase (propiedades
	 * y los metodos)
	 * 
	 * 1-Privado del paquete (package private) (default) (por fefecto) 2-Privado
	 * (private) 3.Publico (public) 4.Protegido ( protected)
	 * 
	 * Los modificadores de acceso se ubican a al izquierda del tipo de datos de las
	 * propiedades
	 */

	String nombre = "Susana de las Mercedez";

	/* Al elemento que es privado solamente se puede aceder desde la misma clase, es
	 * decir, no se puede acceder a un elemento privado ni a través de una instancia
	 * u objeto de la propia clase
	 * 
	 * Una clase bien diseñada es aquella que tiene todas sus propiedades o campos
	 * privados
	 * 
	 * ¿ Como acceder desde fuera de una clase a un elemento (propiedad o campo) que
	 * es privado? La respuesta es mediante metodos publicos denominados getters and
	 * setters getters (Para leer el valor de la propiedad o campo que es privado)
	 * and setters (Para modificar o asignarle valor a un campo o propiedad privada)
	 */

	private String primerApellido = "Martinez";
//	/*
//	 * A continuacion escribimos , manualmente, metodos getters and setters para la
//	 * propiedad primer Apellido
//	 */

	// metodo publico getter

//	public String getPrimerApellido() {
//		/*
//		 * this es una palabra reservada que es una referencia al objeto actual, al
//		 * objeto en curso
//		 */
	
//		return this.primerApellido;}
	// metodo publico setter, que no devuelve nada (void) y recibe como parametro
	// el valor, o el dato, que queremos asignar a la variable privada
//	  this.primerApellido = primerApellido



	
	
	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	double estatura = 1.75;
	int totalCoches = 2;
	Genero genero;

	// El modificador final impide que se pueda cambiar el valor de una variable,
	// por lo cual se convierte una variable a una constante.

	static final String PAIS = "España";

	// Constructor sin parametros, que es el constructor por defecto
	// que se pierde en el momento que creamos otro constructor,
	// pero que puede ser creado cuando queramos

	public Persona() {
		super();

		// TODO Auto-generated constructor stub

	}

	public Persona(String nombre, String primerApellido, double estatura, int totalCoches, Genero genero) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;
		this.totalCoches = totalCoches;
		this.genero = genero;
	}

	public Persona(String nombre, String primerApellido, double estatura) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;
	}

}