package ar.edu.unju.fi.model;

public class Carrera {
	private Integer codigo;
	private String nombre;
	private Integer cantidadAnios;
	private String estado;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public Carrera(Integer codigo, String nombre, Integer cantidadAnios, String estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAnios = cantidadAnios;
		this.estado = estado;
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

	public Integer getCantidadAnios() {
		return cantidadAnios;
	}

	public void setCantidadAnios(Integer cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
