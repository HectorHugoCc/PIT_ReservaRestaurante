package com.reserva.restaurante.service;

import com.reserva.restaurante.bean.UsuarioBean;

public interface LoginService {

	
	public  UsuarioBean login(String usuario, String clave) throws Exception;
	
}
