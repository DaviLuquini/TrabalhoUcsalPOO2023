package entidadess;

import java.util.List;

public class ValidarSolicitacao {
    private List<String> reservasEfetivadas;
    Solicitacao solicitacao = new Solicitacao();
    Reserva reserva = new Reserva();
    
    public void validarSolicitacao() {
        if (solicitacao.getLaboratorio().contains(laboratorio)) {
        	System.out.println("Uma reserva ja foi feita com alguma das suas preferencias");
            break;
        } else {
        	reservasEfetivadas.add(reserva);
        }
        
        if (solicitacao.getDisciplina().contains(disciplina)) {
        	System.out.println("Uma reserva ja foi feita com alguma das suas preferencias");
        	break;
        } else {
        	reservasEfetivadas.add(reserva);
        }
        if (solicitacao.getAlunos().contains(aluno)) {
        	System.out.println("Uma reserva ja foi feita com alguma das suas preferencias");
        	break;
        } else {
        	reservasEfetivadas.add(reserva);
        }
        if (solicitacao.getData() != null && solicitacao.getData().equals(data)) {
        	System.out.println("Uma reserva ja foi feita com alguma das suas preferencias");
        	break;
        } else {
        	reservasEfetivadas.add(reserva);
        }
        if (solicitacao.getTempo().contains(tempo)) {
        	System.out.println("Uma reserva ja foi feita com alguma das suas preferencias");
        	break;
        } else {
        	reservasEfetivadas.add(reserva);
        }
    }
}
