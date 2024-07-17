package arvoregenerica;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	public Node root;

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			super();
			this.value = value;

		}

		public boolean isLeaf() {
			return (this.left == null) && (this.right == null);

		}

	}

	public void insert(int value) {
		if (root == null)
			root = new Node(value);
		else {
			Node newNode = new Node(value);
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			while (queue.size() > 0) {
				Node currentNode = queue.remove();
				if (currentNode.left == null) {
					currentNode.left = newNode;
					break;
				} else {
					queue.add(currentNode.left);

				}
				if (currentNode.right == null) {
					currentNode.right = newNode;
					break;
				} else {
					queue.add(currentNode.right);
				}
			}

		}
	}

	// OPERAÇÃO TRAVESSIA

	// PRÉ ORDEM
	// RAIZ - ESQUERDA - DIREITA
	public void preOrder() {
		preOrder(root);

	}

	private void preOrder(final Node node) {

		if (node == null)
			return;
		preOrder(node.left);
		preOrder(node.right);
		System.out.println(node.value);

	}

	// EM ORDEM
	// ESQUERDA - RAIZ - DIREITA
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(final Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		inOrder(node.right);
		System.out.println(node.value);
	}

	// PÓS ORDEM
	// ESQUERDA - DIREITA - RAIZ
	public void posOrder() {
		posOrder(root);
	}

	private void posOrder(final Node node) {
		if (node == null)
			return;
		posOrder(node.left);
		posOrder(node.right);
		System.out.println(node.value);
	}

	// BUSCA EM LARGURA
	public void buscaEmLargura() {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node node = queue.remove();
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);

			System.out.println(node.value);
		}
	}
	
	//BUSCA EM PROFUNDIDADE é mesma busca da pré ordem.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.insert(1);
		tree.insert(2);

	}

}
