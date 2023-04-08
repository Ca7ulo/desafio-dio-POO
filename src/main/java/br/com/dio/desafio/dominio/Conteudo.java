package br.com.dio.desafio.dominio;

public abstract class  Conteudo {
    protected final double XP_PADRAO=10d; //protected significa que apenas as classes filhas dela terão acesso a esse atributo

    private String titulo ;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
