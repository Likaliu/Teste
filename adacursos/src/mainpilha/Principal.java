package mainpilha;

import pilha.Stack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UTILIZANDO UMA PILHA, INVERTA UM CONJUNTO DE DADOS FORNECIDO
		// PELO USUÁRIO

		int[] numeros = { 5, 4, 3, 2, 1 };

		inverter(numeros);

	}

	private static void inverter(final int[] numeros) {
		Stack stack = new Stack(numeros[0]);

		for (int i = 0; i < numeros.length; i++) {
			stack.push(numeros[i]);
		}
		var node = stack.pop();
		
		while( node != null) {
			System.out.println(node.getValue());
			node = stack.pop();
		}
	}

}
