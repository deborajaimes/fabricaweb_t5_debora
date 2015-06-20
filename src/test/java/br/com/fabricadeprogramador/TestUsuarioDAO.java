package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		Usuario usu = new Usuario();
		usu.setNome("J�oz�o");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		//cadastrando us�rio no banco de dados
		UsuarioDAO  usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}

}
