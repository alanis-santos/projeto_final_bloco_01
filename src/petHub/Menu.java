package petHub;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

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

				break;
			case 2:
				System.out.println("Listar produtos\n\n");

				break;
			case 3:
				System.out.println("Atualizar produto\n\n");

				break;
			case 4:
				System.out.println("Excluir produto\n\n");

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
}
