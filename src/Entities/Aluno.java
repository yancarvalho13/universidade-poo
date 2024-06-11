package Entities;

import java.util.Objects;

public class Aluno {
    private long matricula;
    private String nome;

    public Aluno(long matricula, String nome) throws Exception {

        String convertStr = Long.toString(matricula);

        if(convertStr.length() != 8)
        {
            throw new Exception("Deve conter 8 digitos");
        }

        this.matricula = matricula;
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
