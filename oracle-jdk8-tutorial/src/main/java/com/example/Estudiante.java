package com.example;
/* Ejercicio # 1. Crear una clase que se llame Estudiante, que tenga como propiedades
* 
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
* y la facultad donde estudia */

public class Estudiante {
	 String nombre = "Isabella";
	 String apellido1 = "Gomez";
	 String apellido2= "Grillo";
	 int totalAsignaturas = 6;
	 Facultad facultad;
	 
	 public Estudiante() {
		super();
		
	 }

	 public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	 }

	 public Estudiante(String nombre, String apellido1, String apellido2, int totalAsignaturas, Facultad facultad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.totalAsignaturas = totalAsignaturas;
		this.facultad = facultad;
	 }
	 
	 
	 
	 
	 
	
	

}
