package Services;

import Entities.Laboratorio;
import Entities.Solicitacao;

import java.util.Optional;

import static Register.Cadastro.laboratorios;


public class Marcacao implements IMarcacao{

    public static void SolicitacaoMarcacao(Solicitacao solicitacao) {
        var horario = solicitacao.getHours();
        var data = solicitacao.getDate();
        var labId = solicitacao.getLabId();

        Optional<Laboratorio> laboratorioOptional = laboratorios.stream()
                                                    .filter(x -> x.getId() == labId)
                                                    .findFirst();

        if (!laboratorioOptional.isPresent()) {
            System.out.println("Lab não encontrado!");
            return;
        }

        Laboratorio laboratorio = laboratorioOptional.get();
        if (!laboratorio.getDiasDiponiveis().contains(solicitacao.getDate()) || !laboratorio.getHorariosDisponiveis().contains(horario)) {
            System.out.println("Horário ou data não disponível para o laboratório selecionado.");
            return;
        }

        System.out.println("Reserva efetuada:");
        System.out.println("Professor: " + solicitacao.getProfessor());
        System.out.println("Disciplina: : " + solicitacao.getProfessor().getDisciplina().getSigla());
        System.out.println("Laboratório: LAB" + labId);
        System.out.println("Quantidade de máquina: " + solicitacao.getCapacidade());
        System.out.println("Data reservada: " + solicitacao.getDate());
        System.out.println("Horário: " + solicitacao.getHours());


        laboratorio.getHorariosDisponiveis().remove(horario);
        laboratorio.getDiasDiponiveis().remove(data);


    }
}
