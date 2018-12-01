package com.reserva.restaurante.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.reserva.restaurante.bean.UsuarioBean;
import com.reserva.restaurante.service.LoginService;
import com.reserva.restaurante.service.LoginServiceImpl;

@SuppressWarnings("serial")
@ParentPackage("dawi")
public class LoginAction extends ActionSupport{
	
	private static final Log log = LogFactory.getLog(LoginAction.class);

	private String usuario, clave;

	private LoginService service = new LoginServiceImpl();
	
	@Action(value="/login",results={@Result(name="usuarioExiste", location="/listaRestaurantes.jsp"),
									@Result(name="usuarioNoExiste", location="/login.jsp")})
	public String login(){
		log.info("En eliminar concurso");
		
		UsuarioBean objUsuario  = null;
		try {
			objUsuario = service.login(usuario, clave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(objUsuario == null){
			return "usuarioNoExiste";
		}else{
			return "usuarioExiste";
		}
	}
	
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
}