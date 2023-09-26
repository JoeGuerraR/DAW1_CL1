package org.cibertec.edu.pe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.TableGenerator;
import jakarta.persistence.Id;

@Entity
@TableGenerator(name = "Cliente")
public class Cliente {
	
	@Id
	private int Id;
	private String Apellidos;
	private String Nombres;
	private String Correo;
	private char FechaNacimiento;
	private String DNI;
	
	
	
	public Cliente() {
	}



	public Cliente(int id, String apellidos, String nombres, String correo, char fechaNacimiento, String dni) {
	
		Id = id;
		Apellidos = apellidos;
		Nombres = nombres;
		Correo = correo;
		FechaNacimiento = fechaNacimiento;
		DNI = dni;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		this.Correo = correo;
	}

	public char getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(char fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dni) {
		DNI = dni;
	}
	
	
}
