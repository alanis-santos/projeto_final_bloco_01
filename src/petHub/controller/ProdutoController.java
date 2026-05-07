package petHub.controller;

import java.util.ArrayList;
import java.util.List;

import petHub.model.Produto;
import petHub.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private List<Produto> listarTodas = new ArrayList<Produto>();

	@Override
	public void listarTodos() {
		for (var produto : listarTodas) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listarTodas.add(produto);
		
		System.out.print("O produto" + produto.getNome() + "foi adicionado!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNome());
		
		if (buscaProduto != null) {
			listarTodas.set(listarTodas.indexOf(buscaProduto), produto);
			System.out.print("O produto" + produto.getNome() + "foi atualizado com sucesso!");
		}else {
			System.out.print("O produto" + produto.getNome() + "não foi encontrado!!");
		}
				
	}

	@Override
	public void excluir(String nome) {
		var produto = buscarNaCollection(nome);

		if (produto != null) {
			if (listarTodas.remove(produto) == true) {
				System.out.print("O produto" + nome + "foi excluido com sucesso!");
			}
		} else {
			System.out.print("O produto" + nome + "não foi encontrado!!");
		}
		
	}
	
	public Produto buscarNaCollection(String nome) {
		for (var produto : listarTodas) {
			System.out.print("produtoooo:::" +  produto.getNome());
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		return null;
	}

}
