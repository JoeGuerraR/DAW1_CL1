package org.cibertec.edu.pe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.TableGenerator;
import jakarta.persistence.Id;

@Entity
@TableGenerator(name = "Categoria")

public class Categoria {
	
	@Id
	private int Id;
	private String Nombre;
	
	public Categoria() {
	}

	public Categoria(int id, String nombre) {

		Id = id;
		Nombre = nombre;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	
}
