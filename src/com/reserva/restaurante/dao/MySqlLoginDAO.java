package com.reserva.restaurante.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.reserva.restaurante.bean.FiltroBean;
import com.reserva.restaurante.bean.UsuarioBean;

public class MySqlLoginDAO implements LoginDAO {
	
	SqlSessionFactory sqlMapper = null;
	{
		String archivo = "ConfiguracionIbatis.xml";
		try {
			Reader reader = Resources.getResourceAsReader(archivo);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public UsuarioBean login(String usuario, String clave) throws Exception {
		UsuarioBean obj = null;
		SqlSession sesion = null; 
		try {
			sesion =  sqlMapper.openSession();
			FiltroBean objFil = new FiltroBean();
			objFil.setUsuario(usuario);
			objFil.setClave(clave);
			
			obj = (UsuarioBean)sesion.selectOne("SQL_login", objFil);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			sesion.close();
		}
		return obj;
	}

}
