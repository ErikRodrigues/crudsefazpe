package model.dao.impl;

import java.sql.PreparedStatement;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import model.dao.TelefoneDao;
import model.entities.Telefone;

public class TelefoneDaoJDBC implements TelefoneDao {

	
	@Override
	public void inserir(Telefone cel) {
				
	}

	@Override
	public Telefone consultar(Integer id) {
		PreparedStatement st = null;
		Resultset rs = null;
		
	
		return null;
	}

	@Override
	public void alterar(Telefone id) {
		
		
	}

	@Override
	public void remover(Telefone id) {
		
		
	}

	@Override
	public List<Telefone> listarTodos() {
		return null;
	}

}
