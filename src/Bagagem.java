public abstract class Bagagem implements Comparable<Bagagem>{
    private int peso;
    private String descricao;
    private static int contador; //observar que o parâmetro também ter que ser static

    public Bagagem(int peso, String descricao) {
        this.peso = peso;
        this.descricao = descricao;
        contador++;
    }

    public int getPeso() {        return peso;    }

    public static int getTotalBagagens(){return contador;}

    public void setPeso(int peso) {        this.peso = peso;    }

    public String getDescricao() {        return descricao;    }

    public void setDescricao(String descricao) {        this.descricao = descricao;    }

    public abstract double getCusto();

    @Override
    public String toString() {
        return "Peso: " + peso + " - Descrição: " + descricao;
    }

    @Override
    public int compareTo(Bagagem outraBagagem)
    {
        return this.peso - (outraBagagem.getPeso());
    }
}
