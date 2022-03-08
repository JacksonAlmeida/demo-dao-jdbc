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

			rs = st.executeQuery("SELECT p.id, p.descricao FROM tb_tipo_produto p");

			System.out.println("Lista de Produtos.");

			while (rs.next()) {
				System.out.println("id : " + rs.getInt("id"));
				System.out.println("descrição:" + rs.getString("descricao"));
				System.out.println("----------------------------------");
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DbConfig.closeConnection();
		}
	}
}
