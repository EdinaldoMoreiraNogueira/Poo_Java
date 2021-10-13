package br.com.devnaldo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate date;

    public Mentoria() {
    }

    @Override
    public double calcularXP() {
        return XP_Padão + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescrcao() + '\'' +
                ", date=" + date +
                '}';
    }
}
