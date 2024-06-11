package Entities;

import java.time.LocalTime;
import java.util.*;

public class Laboratorio {
    private int id;
    private int capacidade;
    private List<String> diasDiponiveis;
    private List<LocalTime> horariosDisponiveis;

    public Laboratorio(int id, int capacidade) throws Exception {

        if(id > 12 || id <= 0){
            throw new Exception("LAB 1 ao 12");
        }

        this.id = id;
        this.capacidade = capacidade;

        this.horariosDisponiveis = new ArrayList<>(Arrays.asList(
                LocalTime.of(7, 0),
                LocalTime.of(8, 25),
                LocalTime.of(9, 50),
                LocalTime.of(11,    15),
                LocalTime.of(14, 0),
                LocalTime.of(15, 25),
                LocalTime.of(16, 50),
                LocalTime.of(19, 0),
                LocalTime.of(20, 25)
        ));

        this.diasDiponiveis = new ArrayList<>(Arrays.asList(
                "14/04/2024",
                "15/04/2024",
                "16/04/2024",
                "17/04/2024",
                "18/04/2024"
        ));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<String> getDiasDiponiveis() {
        return this.diasDiponiveis;
    }

    public List<LocalTime> getHorariosDisponiveis() {
        return this.horariosDisponiveis;
    }

    public void getHorariosDisponiveisStr() {
        for(var item : horariosDisponiveis){
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "LAB"+this.id + " => " + capacidade + " máquinas";
    }
}
