package petHub.repository;

import petHub.model.Produto;

public interface ProdutoRepository {
	
	// CRUD do produto
	public void listarTodas();
	public void cadastrar(Produto produto);
   	public void atualizar(Produto produto);
	public void excluir (String nome);

	
}
