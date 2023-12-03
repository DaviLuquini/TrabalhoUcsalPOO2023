package entidades;

import java.util.List;

public class Solicitacao {
	
	private Laboratorio laboratorio;
	private Professor professor;
	private Disciplina disciplina;
	private List<Aluno> alunos;
	private LocalDate data;
	private int tempo;
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public List<Aluno> getGetAlunos() {
		return getAlunos;
	}
	public void setGetAlunos(List<Aluno> getAlunos) {
		this.getAlunos = getAlunos;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	@Override
	public String toString() {
	
		return super.toString();
	}
	

}
