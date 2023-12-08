package br.com.agenda.aplicacao;


import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;


public class Main {

	public static void main(String[] args) {
		ContatoDAO  contatoDao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setNome("Lady Maria");
		contato.setIdade(20);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar o contato
		Contato c1 = new Contato();
		c1.setNome("Lady Maria Fontenele");
		c1.setIdade(24);
		c1.setDataCadastro(new Date());
		c1.setId(4); //Número que está no database
		
		//contatoDao.update(c1);
		
		
		//Remover um contato
		contatoDao.deleteById(1);
		
		//Visualização dos dados
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
	}
}
