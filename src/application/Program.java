package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.PokemonDao;
import model.entities.Pokemon;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PokemonDao pkDao = DaoFactory.createPokemonDao();

		/*
		 * 
		 * Pokemon pk = pkDao.findById(2);
		 * 
		 * System.out.println(pk);
		 * 
		 */

		System.out.println("Entrar com o id do pokémon para deletar:");
		int id = sc.nextInt();

		pkDao.deleteById(id);
		System.out.println("deletado com sucesso");

	}
}
