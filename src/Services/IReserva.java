package Services;

import Entities.Laboratorio;
import Entities.Professor;
import Entities.Solicitacao;

import java.time.LocalTime;
import java.util.Date;

public interface IReserva {
    Solicitacao solicitarReserva(Professor p, Laboratorio lab, String date, LocalTime hora);
    static Professor identificacaoProfessor(String name) throws Exception {
        return null;
    }

    static Laboratorio identificacaoLaboratorio(int id){
        return null;
    };
    String identificacaoData(String data);
}
