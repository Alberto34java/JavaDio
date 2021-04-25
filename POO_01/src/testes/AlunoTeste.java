package testes;

import java.util.Date;

import Models.Aluno;
import Models.Turma;

public class AlunoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma turma = new Turma();
		turma.setSigla("1°A");
		turma.setAno(1);
        
		
		Aluno aluno= new Aluno();
		aluno.setNome("Pedro");
		aluno.setMatricula(123);aluno.setDataNascimento(new Date());
		aluno.setTurma(turma);
		
		// aluno 2 ,3,4 ..
		
		Aluno aluno1= new Aluno();
		aluno1.setNome("João");
		aluno1.setMatricula(123);aluno.setDataNascimento(new Date());
		aluno1.setTurma(turma);
		
		
		//
		Aluno aluno2= new Aluno();
		aluno2.setNome("JOsé");
		aluno2.setMatricula(123);aluno.setDataNascimento(new Date());
		aluno2.setTurma(turma);
		
		//============================
		Aluno aluno3= new Aluno();
		aluno3.setNome("Gustavo");
		aluno3.setMatricula(123);aluno.setDataNascimento(new Date());
		aluno3.setTurma(turma);
		
		
		
	}

}
