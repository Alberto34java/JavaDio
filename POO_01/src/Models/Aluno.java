package Models;

import java.util.Date;

public class Aluno extends Pessoa {

	private Date DataNascimento;
	private Turma turma;
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public void realizarAvaliacao() {
		
	}
}
