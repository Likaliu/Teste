package manipulandoarrays;

public class SuperMarketArray implements SuperMarket {
	private final String[] items;
	private int lastIndex;

	public SuperMarketArray(final int size) {

		items = new String[size];
		lastIndex = -1;
	}

	@Override
	public void add(String item) {
		// TODO Auto-generated method stub
		if (lastIndex == items.length - 1) {
			System.err.println("Lista vazia");
		} else {
			lastIndex++;
			items[lastIndex] = item;
		}

	}

	@Override
	public void print() {
		System.out.println("##########################");
		if (lastIndex < 0) {
			System.out.println("Lista vazia");
		}
		for (int i = 0; i <= lastIndex; i++) {
			System.out.println(i + " - " + items[i]);
		}
		System.out.println("##########################");

	}

	@Override
	public void deletar(final int index) {
		if(index >= 0 && index <= lastIndex) {
			shift(index);
			lastIndex --;
		}else {
			System.err.println("Indice inválido: " + index);
		}

	}
	//MÉTODO CRIADO PARA PUXAR OS ELEMENTOS DA DIREITA PARA A ESQUERDA CONFORME OS ELEMENTOS FOREM EXCLUIDOS
	private void shift(final int index) {
		for(int i = index; i < lastIndex; i++ ) {
			items[i] = items[i + 1];
		}
	}

}
