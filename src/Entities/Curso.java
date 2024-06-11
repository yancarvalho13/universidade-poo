package Entities;

import java.util.HashSet;
import java.util.Set;

public class Curso extends Materia{
    private int numeroDeAlunos;
    Set<Aluno> alunos;

    public Curso(String sigla, String descricao, int numeroDeAlunos) {
        super(sigla, descricao);
        this.numeroDeAlunos = numeroDeAlunos;
        alunos = new HashSet<>();
    }

    public int getNumeroDeAlunos() {
        return numeroDeAlunos;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "( " + super.getSigla().toUpperCase() + " ) " + super.getDescricao().toUpperCase()+ " => " + this.getNumeroDeAlunos();
    }
}
