package petHub;

import java.util.Scanner;


import petHub.controller.ProdutoController;
import petHub.model.Alimentos;
import petHub.model.Produto;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);

	private static final ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {

		Alimentos cc = new Alimentos("Ração para Gatos", "Whiskas", 107f, 1, "Salmão", 10.1f);
		cc.visualizar();

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   PetHub                            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar protudos                      ");
			System.out.println("            3 - Atualizar produto                    ");
			System.out.println("            4 - Excluir produto                      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\n PetHub - O melhor para seu pet!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar produto\n\n");

				cadastrarProduto();

				break;
			case 2:
				System.out.println("Listar produtos\n\n");

				listarProdutos();

				break;
			case 3:
				System.out.println("Atualizar produto\n\n");
				
				atualizarProduto();

				break;
			case 4:
				System.out.println("Excluir produto\n\n");
				
				excluirProduto();
				
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;

			}

		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Alanis Santos - alanisosantos@outlook.com");
		System.out.println("github.com/alanis-santos");
		System.out.println("*********************************************************");
	}

	private static void listarProdutos() {
		produtoController.listarTodos();
	}

	private static void cadastrarProduto() {

		System.out.print("Digite o nome do produto");
		String nome = leia.next();

		System.out.print("Digite a marca do produto: ");
		String marca = leia.next();

		System.out.print("Digite o valor do produto: ");
		float valor = leia.nextFloat();

		System.out.print("Digite o tipo do produto: ");
		int tipo = leia.nextInt();

		switch (tipo) {
		case 1 -> {
			System.out.println("Digite o sabor do produto: ");
			String sabor = leia.next();

			System.out.println("Digite a pesagem do produto: ");
			float pesagem = leia.nextFloat();

			produtoController.cadastrar(new Alimentos( nome, marca, valor, tipo, sabor, pesagem));
			
		}
		default -> System.err.println("Tipo inválido!!");

		}
		

	}

	private static void atualizarProduto() {
		System.out.print("Digite o nome do produto: ");
		String nome = leia.next();
		leia.nextLine();

		Produto produto = produtoController.buscarNaCollection(nome);

		if (produto != null) {

			String marca = produto.getMarca();
			float valor = produto.getValor();
			int tipo = produto.getTipo();

			System.out.print("Marca atual:" + marca + "\nNova marca (pressione ENTER para manter): ");
			String entrada = leia.nextLine();
			marca = entrada.isEmpty() ? marca : entrada;

			System.out.printf("Valor  atual: %s\nNovo valor (pressione ENTER para manter): ", valor);
			entrada = leia.nextLine();
			valor = entrada.isEmpty() ? valor : Float.parseFloat(entrada.replace(',', '.'));

			switch (tipo) {
			case 1 -> {

				String sabor = ((Alimentos) produto).getSabor();

				System.out.print("Sabor atual:" + sabor + "\nNova sabor (pressione ENTER para manter): ");
				entrada = leia.nextLine();
				sabor = entrada.isEmpty() ? sabor : entrada;
				

				float pesagem = ((Alimentos) produto).getPesagem();

				System.out.print("Pesagem atual:" +pesagem + "\nNova pesagem (pressione ENTER para manter): ");
				entrada = leia.nextLine();
				pesagem = entrada.isEmpty() ? pesagem : Float.parseFloat(entrada.replace(',', '.'));


				produtoController.atualizar(new Alimentos( nome, marca, valor, tipo, sabor, pesagem));}
			default -> System.out.println("Tipo de conta inválido!");
			}

		}else {
			System.out.print("\nO produto " + nome + " não foi encontrado!! "); 
		}
	}
	
	private static void excluirProduto() {

		System.out.print("Digite o nome do produto: ");
		String nome = leia.next();
		leia.nextLine();

		System.out.print("\nTem certeza que deseja excluir este produto? (S/N): ");
		String confirmacao = leia.nextLine();

		if (confirmacao.equalsIgnoreCase("S")) {
			produtoController.excluir(nome);
		} else {
			System.out.println("\nOperação cancelada.");
		}

	}

}
