package com.bolsadeides.springboot.web.app.model;

public class Locacion {
	
	private String nombre;
	private String estado;
	private String pais;
	
	public Locacion() {
		
	}
	public Locacion(String nombre, String estado, String pais) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
