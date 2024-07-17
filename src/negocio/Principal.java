package negocio;

public class Principal {
	
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("João", 84.35, 1.59);
		Paciente paciente2 = new Paciente("Liane", 59.00, 1.70);
		Paciente paciente3 = new Paciente("Marcos", 16.99, 1.60);
		
		System.out.println("Diagnosticos dos pacientes");
		paciente1.diagnostico();
		paciente2.diagnostico();
		paciente3.diagnostico();

	}

}
