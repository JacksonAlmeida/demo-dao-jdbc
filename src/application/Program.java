package application;

import model.dao.DaoFactory;
import model.dao.PokemonDao;
import model.entities.Pokemon;

public class Program {

	public static void main(String[] args) {

		PokemonDao pkDao = DaoFactory.createPokemonDao();
		
		Pokemon pk = pkDao.findById(2);
		 
		System.out.println(pk);
	}
}
