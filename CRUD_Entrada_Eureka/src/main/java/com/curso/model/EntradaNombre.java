package com.curso.model;

public class EntradaNombre {

	// Atributos
	private String nombre;
	private int num_butacas;
	private String hora;

	// Constructores
	public EntradaNombre() {

	}

	public EntradaNombre(String nombre, int num_butacas, String hora) {
		this.nombre = nombre;
		this.num_butacas = num_butacas;
		this.hora = hora;
	}

	// Getters&Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_butacas() {
		return num_butacas;
	}

	public void setNum_butacas(int num_butacas) {
		this.num_butacas = num_butacas;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}//class