package entidades;

import java.time.LocalDate;
import java.util.List;

public class Solicitacao implements Reservavel{
	rivate List<Laboratorio> laboratorio;
	private List<Professor> professor;
	private List<Disciplina> disciplina;
	private List<Aluno> Alunos;
	private List<LocalDate> data;
	private List<Integer> tempo;
	
	public List<Laboratorio> getLaboratorio() {
	    return laboratorio;
	}

	public void setLaboratorio(List<Laboratorio> laboratorio) {
	    this.laboratorio = laboratorio;
	}

	public List<Professor> getProfessor() {
	    return professor;
	}

	public void setProfessor(List<Professor> professor) {
	    this.professor = professor;
	}

	public List<Disciplina> getDisciplina() {
	    return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
	    this.disciplina = disciplina;
	}

	public List<Aluno> getAlunos() {
	    return Alunos;
	}

	public void setAlunos(List<Aluno> Alunos) {
	    this.Alunos = Alunos;
	}

	public LocalDate getData() {
	    return data;
	}

	public void setData(LocalDate data) {
	    this.data = data;
	}

	public List<Integer> getTempo() {
	    return tempo;
	}

	public void setTempo(List<Integer> tempo) {
	    this.tempo = tempo;
	}

	@Override
	public String toString() {
	    return "Aula{" +
	            "laboratorio=" + laboratorio +
	            ", professor=" + professor +
	            ", disciplina=" + disciplina +
	            ", alunos=" + Alunos +
	            ", data=" + data +
	            ", tempo=" + tempo +
	            '}';
	}

	@Override
	public boolean estaDisponivel(LocalDate data, int tempoEmMinutos) {
		 // Retorna true se estiver disponível, false caso contrário
		return false;
	}
	

}
