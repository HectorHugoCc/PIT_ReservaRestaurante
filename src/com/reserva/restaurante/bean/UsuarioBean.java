package com.reserva.restaurante.bean;

import java.io.File;

public class UsuarioBean {
	
	private int idusuario;
	private String nombre;
	private String apellidos;
	private String login;
	private String password;
	private String correo;
	private String sexo;
	private String fechaNacimiento;
	
	//Para las fotos
	private File fotos;
	private String fotosFileName;
	private String fotosContentType;
	private byte[] fotosBytes;
	
	public File getFotos() {
		return fotos;
	}
	public void setFotos(File fotos) {
		this.fotos = fotos;
	}
	public String getFotosFileName() {
		return fotosFileName;
	}
	public void setFotosFileName(String fotosFileName) {
		this.fotosFileName = fotosFileName;
	}
	public String getFotosContentType() {
		return fotosContentType;
	}
	public void setFotosContentType(String fotosContentType) {
		this.fotosContentType = fotosContentType;
	}
	public byte[] getFotosBytes() {
		return fotosBytes;
	}
	public void setFotosBytes(byte[] fotosBytes) {
		this.fotosBytes = fotosBytes;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
