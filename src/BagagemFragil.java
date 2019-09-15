public class BagagemFragil extends Bagagem {

    private double valorSeguro;

    public BagagemFragil(int peso, String descricao, double valorSeguro) {
        super(peso, descricao);
        this.valorSeguro=valorSeguro;
    }

    public double getValorSeguro() {        return valorSeguro;    }

    public void setValorSeguro(double valorSeguro) {        this.valorSeguro = valorSeguro;    }

    @Override
    public double getCusto() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bagagem Frágil - " + super.toString() + " Valor Seguro: " + valorSeguro;
    }
}
