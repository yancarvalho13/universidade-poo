package Entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;


public class Solicitacao {

    private Professor professor;
    private Laboratorio laboratorio;
    private String date;
    private LocalTime hours;

    public Solicitacao(Professor professor, Laboratorio laboratorio, String date, LocalTime hours) {
        this.professor = professor;
        this.laboratorio = laboratorio;
        this.date = date;
        this.hours = hours;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Laboratorio getIdLaboratorio() {
        return this.laboratorio;
    }

    public int getLabId() {
        return this.laboratorio.getId();
    }

    public int getCapacidade() {
        return this.laboratorio.getCapacidade();
    }

    public List<LocalTime> getHorariosDisponiveis() {
        return this.laboratorio.getHorariosDisponiveis();
    }

    public void setIdLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LocalTime getHours() {
        return hours;
    }

    public void setHours(LocalTime hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Solicitacao{" +
                "professor=" + professor +
                ", Laboratorio=" + laboratorio +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }
}
