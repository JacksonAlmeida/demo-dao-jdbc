package model.dao;

import model.dao.impl.PokemonDaoJDBC;

public class DaoFactory {

	public static PokemonDao createPokemonDao() {
		return new PokemonDaoJDBC();
	}
}
