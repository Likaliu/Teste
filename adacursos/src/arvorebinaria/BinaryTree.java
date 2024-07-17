package arvorebinaria;

public class BinaryTree {

	private Node root;

	public class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
		} else {
			insert(root, value);
		}
	}

	private void insert(final Node root, final int value) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		if (value == root.value)
			return;
		if (value > root.value) {
			if (root.right == null)
				root.right = new Node(value);
			else
				insert(root.right, value);

		} else {
			if (root.left == null)
				root.left = new Node(value);
			else
				insert(root.right, value);
		}

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

	public boolean contains(int value) {
		return contains(root, value);
	}

	private boolean contains(final Node root, final int value) {
		if (root == null)
			return false;
		if (root.value == value)
			return true;
		if (value > root.value)
			return contains(root.right, value);
		else
			return contains(root.left, value);

	}
	
	//MÉTODO PARA RETORNAR O MENOR VALOR 
	public int minValue(Node currentNode) {
		while(currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}
	
	public void deleteNode(int value) {
		root = deleteNode(root, value);
	}
	
	private Node deleteNode(final Node root, final int value) {
		if(root == null) return null;
		if(value < root.value) {
			root.left = deleteNode(root.left, value);
		}else if( value > root.value) {
			root.right = deleteNode(root.right, value);
		}else {
			if((root.left == null) && (root.right == null)) {
				return null;
			}else if(root.left == null) {
				return root.right;
				
			}else if(root.right == null) {
				return root.left;
			}else {
				int minValue = minValue(root.right);
				root.value = minValue;
				root.right = deleteNode(root.right, minValue);
			}
		}
		return root;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
