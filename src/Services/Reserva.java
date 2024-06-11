package Services;

import Entities.Laboratorio;
import Entities.Professor;
import Entities.Solicitacao;

import java.time.LocalTime;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static Register.Cadastro.laboratorios;
import static Register.Cadastro.professores;

public class Reserva implements IReserva{

    @Override
    public Solicitacao solicitarReserva(Professor p, Laboratorio lab, String date, LocalTime hora) {
        return new Solicitacao(p, lab , date, hora);
    }

    public static Professor identificacaoProfessor(String name) throws Exception {
        Optional<Professor> professor = professores.stream()
                .filter(x -> x.getNome().equals(name))
                .findFirst();

        return professor.orElse(null);
    }


    public Laboratorio identificacaoLaboratorio(int id) {
        Optional <Laboratorio> laboratorio = laboratorios.stream()
                                                         .filter(x -> x.getId() == id )
                                                         .findFirst();

        return (laboratorio.isPresent()) ? laboratorio.get() : null;
    }

    @Override
    public String identificacaoData(String data) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        return (matcher.matches()) ? data : "Formato dia/mes/ano";
    }

}
