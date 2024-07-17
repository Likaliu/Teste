package negocio;

public class Paciente {
	private String nome;
	private double peso;
	private double altura;

	public Paciente(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double calculaImc() {
		double imc = this.peso / (this.altura * this.altura);

		return imc;
	}

	public void diagnostico() {
		double imc = calculaImc();

		if (this.peso < 16) {
			System.out.println("Baixo peso muito grave");
		} else if ((imc >= 16) && (imc <= 16.99)) {
			System.out.println("Baixo peso grave");
		} else if ((imc >= 17) && (imc <= 18.49)) {
			System.out.println("Baixo peso");

		} else if ((imc >= 18.50) && (imc <= 24.99)) {
			System.out.println("Peso normal");
		} else if ((imc >= 25) && (imc <= 29.99)) {
			System.out.println("Sobrepeso");
		}

		else if ((imc >= 30) && (imc <= 34.99)) {
			System.out.println("Obesidade grau I");
		} else if ((imc >= 35) && (imc <= 39.99)) {
			System.out.println("Obesidade grau II");
		}

		else if (imc >= 40) {
			System.out.println("Obesidade grau III (obesidade mórbida)");
		} else {
			System.out.println("Não foi possivél calcular");
		}
	}

}
