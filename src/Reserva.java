import java.util.Date;

public class Reserva implements IReserva {

    private int id;
    private Solicitacao solicitacao;
    private SituacaoReserva situacao;
    private Date diaDaReserva;
    private int duracao;
    private Professor professor;
    private Disciplina disciplina;
    private Date dataLiberacao;


    public Reserva(int id, Solicitacao solicitacao, SituacaoReserva situacao, Date diaDaReserva, int duracao, Professor professor, Disciplina disciplina, Date dataLiberacao) {
        this.id = id;
        this.solicitacao = solicitacao;
        this.situacao = situacao;
        this.diaDaReserva = diaDaReserva;
        this.duracao = duracao;
        this.professor = professor;
        this.disciplina = disciplina;
        this.dataLiberacao = dataLiberacao;
    }


    public int getId() {
        return id;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public SituacaoReserva getSituacao() {
        return situacao;
    }

    public Date getDiaDaReserva() {
        return diaDaReserva;
    }

    public int getDuracao() {
        return duracao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Date getDataLiberacao() {
        return dataLiberacao;
    }

 


    public String toString() {
        return "Reserva [id=" + id +
                ", solicitacao=" + solicitacao +
                ", situacao=" + situacao +
                ", diaDaReserva=" + diaDaReserva +
                ", duracao=" + duracao +
                ", professor=" + professor +
                ", disciplina=" + disciplina +
                ", dataLiberacao=" + dataLiberacao +
                ']';
    }
}
