package edu.fje.daw2.m07uf2.model;

import org.springframework.data.annotation.Id;

public class Previsio {

    @Id
    public String id;

    public float temperatura;
    public String dia;
    public String temps;

    public Previsio() {}

    public Previsio(float temperatura, String dia, String temps) {
        this.temperatura = temperatura;
        this.dia = dia;
        this.temps = temps;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Previsio)) return false;

        Previsio previsio = (Previsio) o;

        return id.equals(previsio.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", dia='" + dia + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", temps=" + temps +
                '}';
    }
}