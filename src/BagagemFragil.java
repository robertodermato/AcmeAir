// Bagagens frágeis possuem franquia de 20kg e o dobro do valor de kg excedente das bagagens normais.

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
        if ((super.getPeso()-20)<=0) return 0;
        return (super.getPeso()-20)*(Bagagem.getCustoExcesso())*2;
    }

    @Override
    public String toString() {
        return "Bagagem Frágil - " + super.toString() + " - Valor Seguro: " + valorSeguro + " - Custo: R$ " + getCusto();
    }
}
