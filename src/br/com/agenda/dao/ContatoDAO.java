package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;

import com.mysql.cj.jdbc.ClientPreparedStatement;

import br.com.agenda.model.Contato;
import br.com.agenda.factory.*;

public class ContatoDAO {

	public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES (?, ?, ?)";
		
		Connection conn = null;
		ClientPreparedStatement pstm = null;
		
		try {
			//Criar conexão com o bd
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma preparedStatement para executar uma query
			pstm = (ClientPreparedStatement) conn.prepareStatement(sql);
			
			//Adição de valores esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			//Execução da query
			pstm.execute();
			
			System.out.println("Contato salvo com sucesso");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//fechar conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
