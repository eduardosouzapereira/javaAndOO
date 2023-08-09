package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		// Instância da conexão
		Connection conn = null;

		// Statement serve para montar o comando SQL para ser executado
		Statement st = null;
		// ResultSet serve para guardar o resultado da consulta em forma de tabela
		ResultSet rs = null;

		try {
			// Estabelece conexão com BD
			conn = DB.getConnection();

			// Instanciação do statement
			st = conn.createStatement();

			// Executa a consulta SQL e guarda na variável rs como tabela
			rs = st.executeQuery("select * from department");

			// rs.next(); retorna falso se chegar no último elemento da tabela
			// Então, "enquanto for verdadeiro, imprima na tela"
			while (rs.next()) {
				// Os métodos get precisam ser do tipo dos campos da tabela
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Fecha o resultSet
			DB.closeResultSet(rs);
			// Fecha o statement
			DB.closeStatement(st);
			// Fecha a conexão
			DB.closeConnection();
		}
	}
}
