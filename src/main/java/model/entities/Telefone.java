package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Telefone implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private int ddd;
	private String numero;
	private String tipo;
	private Usuario usuario;

	private Telefone Telefone;

	public Telefone() {
		
	}
	
	public Telefone(Integer id, int ddd, String numero, String tipo, Usuario usuario) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		this.usuario = usuario;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return Telefone;
	}

	public void setUsuario(Telefone telefone) {
		this.Telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ddd, id, numero, tipo, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return ddd == other.ddd && Objects.equals(id, other.id) && Objects.equals(numero, other.numero)
				&& Objects.equals(tipo, other.tipo) && Objects.equals(usuario, other.usuario);
	}


	

}