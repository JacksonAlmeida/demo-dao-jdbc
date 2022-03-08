package model.dao;

import db.DbConfig;
import model.dao.impl.PokemonDaoJDBC;

public class DaoFactory {

	public static PokemonDao createPokemonDao() {
		return new PokemonDaoJDBC(DbConfig.getConnection());
	}
}
