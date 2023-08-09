package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	// Classe para obter e encerrar a conexão com o BD
	private static Connection conn = null;

	// Método para conectar com o BD
	public static Connection getConnection() {
		if (conn == null) {
			try {
				// Pega as propriedades da conexão
				Properties props = loadProperties();
				// String do banco
				String url = props.getProperty("dburl");
				// Conexão propriamente dita
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}

	// Método para encerrar a conexão com o BD
	public static void closeConnection() {
		// Se a conexão estiver instanciada, fechar a conexão
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	// Lê os dados do arquivo db.properties e guarda numa variável do tipo
	// Properties
	private static Properties loadProperties() {
		// Tenta abrir o arquivo
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			// Instancia o objeto do tipo Properties
			Properties props = new Properties();
			// Faz a leitura do arquivo apontado por fs (db.properties) e guarda no objeto
			// "props"
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	// Método para fechar o statement, para evitar repetição de try catch no main
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	// Método para fechar o result set, para evitar repetição de try catch no main
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
