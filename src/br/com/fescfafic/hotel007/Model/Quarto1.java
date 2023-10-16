package br.com.fescfafic.hotel007.Model;
abstract class Quarto1 {
    public int numeroDoQuarto;
    public String tipoDeQuarto;
    public double precoPorNoite;
    public boolean disponibilidade;

    public Quarto1(int numeroDoQuarto, String tipoDeQuarto, double precoPorNoite) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipoDeQuarto = tipoDeQuarto;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = true;
    }

    public void exibirInfo() {
        System.out.println("Número do Quarto: " + numeroDoQuarto);
        System.out.println("Tipo de Quarto: " + tipoDeQuarto);
        System.out.println("Preço por Noite: " + precoPorNoite);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Ocupado"));
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void ocuparQuarto() {
        disponibilidade = false;
    }

    public void desocuparQuarto() {
        disponibilidade = true;
    }
}