package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DbConfig;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		try {

			Connection conn = DbConfig.getConnection();
			Statement st = null;
			ResultSet rs = null;

			st = conn.createStatement();

			rs = st.executeQuery("SELECT p.id, p.nome, p.ataque, p.defesa FROM tb_pokemon p");

			System.out.println("Lista de Produtos.");

			while (rs.next()) {
				System.out.println("id : " + rs.getInt("id"));
				System.out.println("nome do pokemon:" + rs.getString("nome"));
				System.out.println("ataque: " +rs.getInt("ataque"));
				System.out.println("defesa: "+rs.getInt("defesa"));
				System.out.println("----------------------------------");
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DbConfig.closeConnection();
		}
	}
}
