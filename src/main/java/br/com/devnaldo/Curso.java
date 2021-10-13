package br.com.devnaldo;

public class Curso extends Conteudo {

    private  int cargaHoraria;


    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_Padão * cargaHoraria;
    }


    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    private int cargaHorária;

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescrcao() + '\'' +
                ", cargaHorária=" + cargaHorária +
                '}';
    }
}
