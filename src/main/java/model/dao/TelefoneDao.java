package model.dao;

import java.util.List;

import model.entities.Telefone;

public interface TelefoneDao {
	
	void inserir(Telefone cel);
	Telefone consultar(Integer id);
	void alterar(Telefone id);
	void remover(Telefone id);
	List<Telefone> listarTodos();

}
