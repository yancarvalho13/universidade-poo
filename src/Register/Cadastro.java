package Register;

import Entities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Cadastro {

    public static List<Disciplina> disciplinas = new ArrayList<>(
            Arrays.asList(
                    new Disciplina("BES005", "Logica de programação e algoritmos"),
                    new Disciplina("BES006", "Estrutura de dados"),
                    new Disciplina("BES008", "Programação orientada a objetos"),
                    new Disciplina("BES011", "Bancos de dados"),
                    new Disciplina("BES012", "Engenharia de requisitos"),
                    new Disciplina("BES020", "Programação para dispositivos moveis"),
                    new Disciplina("BES026", "Sistemas distribuidos"),
                    new Disciplina("BES038", "Inteligencia artificial"),
                    new Disciplina("BES049", "Programação Web"),
                    new Disciplina("BES048", "Programação Front End")
            )
    );

    public static List<Professor> professores = new ArrayList<>(
            Arrays.asList(
                    new Professor(1, "Professor01", disciplinas.get(0)),
                    new Professor(2, "Professor02", disciplinas.get(1)),
                    new Professor(3, "Professor03", disciplinas.get(2)),
                    new Professor(4, "Professor04", disciplinas.get(3)),
                    new Professor(5, "Professor05", disciplinas.get(4)),
                    new Professor(6, "Professor06", disciplinas.get(5)),
                    new Professor(7, "Professor07", disciplinas.get(6)),
                    new Professor(8, "Professor08", disciplinas.get(7)),
                    new Professor(9, "Professor09", disciplinas.get(8)),
                    new Professor(10, "Professor10", disciplinas.get(9))
            )
    );

    public static List<Curso> cursos = new ArrayList<>(
            Arrays.asList(
                    new Curso("BES", "Bacharel em Engenharia de Software", 200),
                    new Curso("ADS", "Análise e Desenvolvimento de Sistemas", 120),
                    new Curso("JGD", "Jogos Digitais", 90),
                    new Curso("GTI", "Gestão da Tecnologia da Informação", 40),
                    new Curso("INF", "Informática", 20),
                    new Curso("RDC", "Rede de Computadores", 30)
            )
    );
    public static List<Laboratorio> laboratorios;

    static {
        try {
            laboratorios = new ArrayList<>(
                    Arrays.asList(
                            new Laboratorio(1, 20),
                            new Laboratorio(2, 20),
                            new Laboratorio(3,  20),
                            new Laboratorio(4,  20),
                            new Laboratorio(5,  15),
                            new Laboratorio(6,  15),
                            new Laboratorio(7,  15),
                            new Laboratorio(8,  15),
                            new Laboratorio(9,  15),
                            new Laboratorio(10,  15),
                            new Laboratorio(11,  15),
                            new Laboratorio(12,  30)

                    )
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void cadastrarAlunos(List<Curso> cursos) throws Exception {
        long matriculaInicial = 20220001;
        for (Curso curso : cursos) {
            for (int i = 1; i <= curso.getNumeroDeAlunos(); i++) {
                curso.adicionarAluno(new Aluno(matriculaInicial, "Aluno" + String.format("%03d", i)));
                matriculaInicial++;
            }
        }
    }

    public static void listaDeAlunos() throws Exception {
        for(Curso curso: cursos){
            System.out.println("Curso: " + curso.getDescricao());
            for(Aluno aluno : curso.getAlunos()){
                System.out.println(aluno.getNome());
            }
            System.out.println();
        }
    }

    public static void cadastrarSolicitacao(){

    }

}
