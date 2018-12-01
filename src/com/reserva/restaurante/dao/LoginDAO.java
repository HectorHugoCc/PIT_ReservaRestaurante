package com.reserva.restaurante.dao;

import com.reserva.restaurante.bean.UsuarioBean;

public interface LoginDAO {

	public  UsuarioBean login(String usuario, String clave) throws Exception;
}
