package com.example;

public class App {

	public static void main(String[] args) {
		
		/**
		 * ¿Como crear o instanciar objetos?
		 * 
		 * Invocando o llamando a un constructor de la clase del tipo de objeto
		 * que queremos crear
		 * A modo de ejemplo:
		 * 
		 * Queremos crear un objeto de tipo Persona, para lo cual vamos a llamar o a invocar
		 * al constructor de la clase Persona
		 * 
		 * ¿Que es un constructor?
		 * Es un metodo que tiene el mismo nombre de la clase.
		 * Por defecto, todas las clases tiene un constructor implicito, sin parametros,
		 * que te han otorgado gratuitamente y que lo pierdes en cuanto creas otro constructor  
		 * 
		 * Para crear o instancion el objeto, el constructor hay que prefijarlo con el operador
		 * new
		 *
		 */ 
		int x = 45;
		
		/* En la sentencia que aparece a continuacion, la creacion o instanciacion del objeto
		 * Persona tiene lugar a traves de la sentencia new Persona (), es decir a traves de la
		 * invocaciôn del constructor de la clase Persona.
		 * Y la variable persona 1 NO ES EL OBJETO , es una referencia,  eue en algunos lenguajes
		 * de programacion como C++ se le llama un puntero, o apuntador, porque apunta a la
		 * direccion de memoria donde reside el objeto creado 
         * Y, tambien, a traves de la variable persona1 es que puedo acceder a los elementos
         * que estan en la clase Persona, utilizando el operador punto (.) */ 
		
		Persona persona1 = new Persona(); 
		
		//Para mostrar el nombre de la persona
		
		System.out.println("El nombre de la persona1 es: " + persona1.nombre);
		
		Persona persona2 = new Persona( "Juan", "Martinez", 1.80);
	
		/* Ejercicio # 1. Crear una clase que se llame Estudiante, que tenga como propiedades
        * 1. nombre
        * 2. apellido1
        * 3. apellido2
        * 4. totalAsignaturas
        * 5. facultad, que sea un tipo enum, con las constantes INFORMATICA, CIENCIAS, MATEMATICAS 
        * 
        * Segundo:
        * 
        * El metodos main, poder crear objetos estudiantes, sin parametros, es decir, vacios y
        * tambien que los pueda crear suministrandoles el nombre, apellido1, totalAsignaturas 
        * y la facultad donde estudia*/
		
		/*creando objeto estudiante*/
	
		Estudiante estudiante1 = new Estudiante();
		
		//  Mostrando el nombre de estudiante1
		System.out.println("El nombre del estudiante es: "+ estudiante1.nombre);
		
		// cambiando el nombre del estudiante
		estudiante1.nombre = "Margarita";
		
		System.out.println("Se new ha cambiado el nombre del estudiante a: "+estudiante1.nombre);
		
		/* para crear un objeto estudiante y en el mismo momento asignarle un nombre, por ejemplo, 
		 * tiene que existir el constructor */ 
		
		Estudiante estudiante2; 
		
		estudiante2 = new Estudiante();
		
		Estudiante estudiante3;
		estudiante3 = new Estudiante();
		
		Estudiante estudiante4;
		estudiante4 = new Estudiante();
		Estudiante estudiante5;
		estudiante5 = new Estudiante("Pepe");
		
		System.out.println(estudiante5.nombre);
		
		Estudiante estudiante6;
		estudiante6 = new Estudiante("Yodalis",
				"Grillo",
				"Castillo",
				6,
				Facultad.MATEMATICAS);
					
	
		}
	}
		
				
		

