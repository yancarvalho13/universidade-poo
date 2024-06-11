package Entities;

import java.util.Objects;

public class Professor {
    private int id;
    private String nome;
    private Disciplina disciplina;

    public Professor(int id, String nome, Disciplina disciplina) {

        if(id >= 11 || id <= 0){
            throw new IllegalArgumentException("ID de 1 a 10");
        }

        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return id == professor.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return this.getNome() + " => " + disciplina.getSigla()  ;
    }
}
