package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	private Integer dni;
	private String nombre;
	private String apellido;
	private String email;
	private Integer telefono;
	private LocalDate fechaNac;
	private String domicilio;
	private Integer libretaUniv;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(Integer dni, String nombre, String apellido, String email, Integer telefono, LocalDate fechaNac,
			String domicilio, Integer libretaUniv) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.domicilio = domicilio;
		this.libretaUniv = libretaUniv;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getLibretaUniv() {
		return libretaUniv;
	}

	public void setLibretaUniv(Integer libretaUniv) {
		this.libretaUniv = libretaUniv;
	}
	
}