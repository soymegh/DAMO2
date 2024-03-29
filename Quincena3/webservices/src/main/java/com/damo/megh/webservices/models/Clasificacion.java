package com.damo.megh.webservices.models;

public class Clasificacion {

	private int idClasificacion;
	private String abreviacion;
	private String nombre;
	private boolean activo;

	public Clasificacion(int idClasificacion, String abreviacion, String nombre, boolean activo) {
		super();
		this.idClasificacion = idClasificacion;
		this.abreviacion = abreviacion;
		this.nombre = nombre;
		this.activo = activo;
	}

	public Clasificacion() {
		super();
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getAbreviacion() {
		return abreviacion;
	}

	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
