public abstract class Bagagem {
    private double peso;
    private String descricao;

    public Bagagem(double peso, String descricao) {
        this.peso = peso;
        this.descricao = descricao;
    }

    public double getPeso() {        return peso;    }

    public void setPeso(double peso) {        this.peso = peso;    }

    public String getDescricao() {        return descricao;    }

    public void setDescricao(String descricao) {        this.descricao = descricao;    }

    public abstract double getCusto();

    @Override
    public String toString() {
        return "Peso" + peso + " Descrição: " + descricao;
    }
}
