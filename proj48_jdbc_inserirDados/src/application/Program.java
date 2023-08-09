package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Objeto de conexão
		Connection conn = null;
		// Objeto de comando SQL
		PreparedStatement st = null;
		try {
			// Obtendo conexão com BD
			conn = DB.getConnection();

			// Comando SQL, con interrogações correspondentes aos campos indicados
			st = conn.prepareStatement(
					"INSERT INTO seller "
							+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
							+ "VALUES "
							+ "(?, ?, ?, ?, ?)",
					// Facultadivo: retornar chave do banco (auto incrementada)
					Statement.RETURN_GENERATED_KEYS);
			// Núms de 1 a 5 indicando qual interrogação substituir
			// Valor seguinte, de acordo com as tipagens indicadas pelo set
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			// Formato de data do SQL é diferente
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);

			// EXAMPLE 2:
			// st = conn.prepareStatement(
			// "insert into department (Name) values ('D1'),('D2')",
			// Statement.RETURN_GENERATED_KEYS);

			// Comando para executar update retorna número de linhas alteradas
			int rowsAffected = st.executeUpdate();

			// Impressão de linhas afetadas
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: " + id);
				}
			} else {
				System.out.println("No rows affected!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
