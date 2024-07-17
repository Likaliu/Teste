package manipulandoarrays;

import java.util.Scanner;

public class Principal {

	private static int SIZE = 5;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		SuperMarket superMarket = new SuperMarketArray(SIZE);
		int opcao;
		
		do {
			System.out.println("Lista de compras");
			System.out.println("[1] - Inserir");
			System.out.println("[2] - Listar");
			System.out.println("[3] - remover");
			System.out.println("[4] - sair");
			
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o item a ser inserido: ");
					String item = entrada.next();
					superMarket.add(item);
					break;
				case 2:
					superMarket.print();
					break;
				case 3:
					System.out.println("Digte a pção do  item a ser removido");
					//superMarket.deletar(index); CORRRIGIR ERRO
					break;
				case 4:
					System.out.println("Saindo do programa");
					break;
				default:
					System.out.println("Opção inválida. Escolha novamente.");
			}
			
		}while(opcao != 4);
			
		entrada.close();
		
	}

}
