package Aplicacao;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class App {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = DaoFactory.createUsuarioDao();
		
		Usuario user = usuarioDao.consultar(1);
		
		System.out.println(user);
		
		
		

	}

}
