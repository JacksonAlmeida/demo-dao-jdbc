package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Pokemon implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private int ataque;
	private int defesa;
	
	public Pokemon() {
		
	}

	public Pokemon(long id, String nome, int ataque, int defesa) {
		this.id = id;
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ataque, defesa, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return ataque == other.ataque && defesa == other.defesa && id == other.id && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", ataque=" + ataque + ", defesa=" + defesa + "]";
	}
	
}
