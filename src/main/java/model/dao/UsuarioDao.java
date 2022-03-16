package model.dao;

import java.util.List;

import model.entities.Usuario;

public interface UsuarioDao {

	void inserir(Usuario user);
	Usuario consultar(Integer id);
	void alterar(Usuario id);
	void remover(Usuario id);
	List<Usuario> listarTodos();
	
	
}