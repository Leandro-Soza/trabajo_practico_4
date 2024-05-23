package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Materia {
	private Integer codigo;
	private String nombre;
	private String curso;
	private Integer cantidadHoras;
	private String modalidad;
	@Autowired
	private Docente docente;
	private Carrera carrera;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(Integer codigo, String nombre, String curso, Integer cantidadHoras, String modalidad,
			Docente docente, Carrera carrera) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(Integer cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
}
