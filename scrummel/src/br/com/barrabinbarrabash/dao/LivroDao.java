package br.com.barrabinbarrabash.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.barrabinbarrabash.ConnectionFactory;
import br.com.barrabinbarrabash.entity.Livro;


public class LivroDao {
	
	private Connection connection;
	
	public LivroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Livro livro) {
		
		String sql = "insert into livro (isbn, quantEstoque, nome, autor, aditora, dataLanc, numPaginas, " +
				"categoria, resumo, precoCompra, formatoCapa) values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
				
			stmt.setInt(1, livro.getIsbn());
			stmt.setInt(2, livro.getQuantidadeEmEstoque());
			stmt.setString(3, livro.getNome());
			//stmt.setAutores(4, livro.getAutores());
			//stmt.setEditora(5, livro.getEditora());
			//stmt.setDate(6, new Date(livro.getDataLancamento().getTimeInMillis()));
			stmt.setInt(7, livro.getNumPaginas());
			//stmt.setCategoria(8, livro.getCategoria());
			stmt.setString(9, livro.getResumo());
			stmt.setDouble(10, livro.getPrecoCompra());
			stmt.setString(11, livro.getFormatoCapa());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
