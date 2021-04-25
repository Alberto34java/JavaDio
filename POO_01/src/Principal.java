import Models.Disciplina;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = new Disciplina();
		
		disciplina.setNome("Matemática");
		disciplina.setCargaHoraria(240);
		
		System.out.println(disciplina.getNome());
		System.out.println(disciplina.getCargaHoraria());

	}

}
