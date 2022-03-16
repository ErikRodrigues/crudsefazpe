package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.UsuarioDao;
import model.entities.Telefone;
import model.entities.Usuario;

public class UsuarioDaoJDBC implements UsuarioDao {

	private Connection con;

	public UsuarioDaoJDBC(Connection con) {
		this.con = con;
	}

	@Override
	public void inserir(Usuario user) {

	}

	@Override
	public Usuario consultar(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = con.prepareStatement(
					"SELECT usuario.*,telefone.Numero as Contato " 
			        + "FROM usuario INNER JOIN telefone	"
					+ "ON usuario.TelefoneId = telefone.Id " 
			        + "WHERE usuario.Id = ? ");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Telefone tel = new Telefone();
				//tel.setDdd(rs.getInt("dd"));
				//tel.setNumero(rs.getString("Numero"));
				//tel.setTipo(rs.getString("Tipo"));
				//tel.setId_usuario(id);
				tel.setUsuario(rs.getString("id"));
				Usuario user = new Usuario();
				user.setId(rs.getInt("Id"));
				user.setName(rs.getString("Nome"));
				user.setSenha(rs.getString("Senha"));
				user.setEmail(rs.getString("Email"));
				
				
				return user;
			}
			return null;
			
		} 
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void alterar(Usuario id) {

	}

	@Override
	public void remover(Usuario id) {

	}

	@Override
	public List<Usuario> listarTodos() {

		return null;
	}

}
