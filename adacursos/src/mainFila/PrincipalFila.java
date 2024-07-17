package mainFila;

import java.util.Random;

import fila.Fila;

public class PrincipalFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// IMAGINE QUE VOCÊ ESTÁ DESENVOLVENDO UM SISTEMA DE
		// ATENDIMENTO AO CLIENTE PARA UMA LOJA. CRIE UM PROGRMA
		// JAVA QUE SIMULE A FILA DE ATENDIMENTO, ONDE OS CLIENTES
		// ENTRAM NA FILA E SÃO ATENDIDOS UM POR UM.

		int qtdCliente = 5;
		var random = new Random();
		int cliente = random.nextInt(101);

		Fila newFila = new Fila(cliente);
		System.out.println("Chegou cliente" + cliente);

		// SIMULA A CHEGADA DE CLIENTES
		for (int i = 2; i <= qtdCliente; i++) {
			cliente = random.nextInt(101);
			System.out.println("Chegou cliente: " + cliente);
			newFila.enqueue(cliente);

		}

		// ATENDIENTO DOS CLIENTES
		var node = newFila.dequeue();
		System.out.println("Atendendo o cliente" + node.getValue());
		node = newFila.dequeue();

	}

}
