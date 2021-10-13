package br.com.devnaldo;

public abstract class Conteudo {

    protected static final double XP_Padão = 10d;

    private String titulo;
    private String descrcao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }
}
