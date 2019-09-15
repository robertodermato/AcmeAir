public class BagagemNormal extends Bagagem{

    public BagagemNormal(double peso, String descricao) {
        super(peso, descricao);
    }

    @Override
    public double getCusto() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bagagem Normal - " + super.toString();
    }
}