package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME="root";
	
	private static final String PASSWORD="root";
	
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/agenda";
	
	//Conexão com o banco de dados
	public static Connection createConnectionToMySQL() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) {
		//Recuperar conexão com o bd
		Connection conn = createConnectionToMySQL();
		
		if
	}
	
}
