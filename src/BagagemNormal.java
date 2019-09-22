public class BagagemNormal extends Bagagem{



    public BagagemNormal(int peso, String descricao) {
        super(peso, descricao);
    }



    @Override
    public double getCusto() {
        if ((super.getPeso()-20)<=0) return 0;
        return (super.getPeso()-20)*Bagagem.getCustoExcesso();
    }

    @Override
    public String toString() {
        return "Bagagem Normal - " + super.toString() + " - Custo: R$ " + getCusto();
    }
}
