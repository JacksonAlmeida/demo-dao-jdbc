package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.PokemonDao;
import model.entities.Pokemon;

public class PokemonDaoJDBC implements PokemonDao {

	private Connection conn;

	public PokemonDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Pokemon obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Pokemon obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pokemon findById(long id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT p.id, p.nome, p.ataque, p.defesa FROM `tb_pokemon` p WHERE id = ?");

			st.setLong(1, id);
			rs = st.executeQuery();

			if (rs.next()) {
				Pokemon pk = new Pokemon();
				pk.setId(rs.getLong("id"));
				pk.setNome(rs.getString("nome"));
				pk.setAtaque(rs.getInt("ataque"));
				pk.setDefesa(rs.getInt("defesa"));
				return pk;
			}

			return null;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	@Override
	public List<Pokemon> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
