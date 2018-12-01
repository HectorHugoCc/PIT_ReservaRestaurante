package com.reserva.restaurante.bean;

public class FiltroBean {

	private String nombre ="";
	private double tenedores;
	private int ticket;
	
	
	//Para el login
	private String usuario, clave;
	
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	private String[] opciones;


	public String getNombre() {
		return nombre + "%";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTenedores() {
		return tenedores;
	}

	public void setTenedores(double tenedores) {
		this.tenedores = tenedores;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}
	
	
	
}
