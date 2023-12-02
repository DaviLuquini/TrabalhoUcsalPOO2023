import java.util.List;

public class Execucao {
    public static void main(String[] args) {
        Base bs = new Base();

        for (Laboratorio lab : bs.getLaboratorios()) {
            System.out.println(lab);
        }

        Solicitacao solicitacao = new Solicitacao(
                bs.getLaboratorios().get(0),
                bs.getProfessores().get(0),
                bs.getDisciplinas().get(0),
                bs.getAlunos(5, 1),
                LocalDateTime.now(),
                90
        );

        System.out.println("Solicitação: " + solicitacao);

        Reserva reserva = new Reserva(solicitacao, SituacaoReserva.APROVADA, LocalDateTime.now(), 90);

        System.out.println("Reserva: " + reserva);
    }
}
