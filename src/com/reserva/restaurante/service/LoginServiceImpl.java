package com.reserva.restaurante.service;

import com.reserva.restaurante.bean.UsuarioBean;
import com.reserva.restaurante.dao.MySqlLoginDAO;

public class LoginServiceImpl implements LoginService {

	MySqlLoginDAO dao = new MySqlLoginDAO();
	
	@Override
	public UsuarioBean login(String usuario, String clave) throws Exception {
		return dao.login(usuario, clave);
	}

}
