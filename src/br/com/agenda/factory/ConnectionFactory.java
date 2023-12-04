package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME="root";
	
	private static final String PASSWORD="root";
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	public static Connection createConnectionToMySQL() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception{
		//Recuperar conexão
		Connection conn = createConnectionToMySQL();
		
		//Testar se a conexão é nula
		if(conn!=null) {
			System.out.println("Conexão obtida com sucesso.");
			conn.close();
		}
	}
	
	

	
}
