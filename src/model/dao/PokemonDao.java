package model.dao;

import java.util.List;

import model.entities.Pokemon;

public interface PokemonDao {

	void insert(Pokemon obj);
	void update(Pokemon obj);
	void deleteById(long id);
	Pokemon findById(long id);
	List<Pokemon> findAll();
}
