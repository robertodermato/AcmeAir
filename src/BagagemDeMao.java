public class BagagemDeMao extends Bagagem {

    public BagagemDeMao(int peso, String descricao) {
        super(peso, descricao);
    }

    @Override
    public double getCusto() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bagagem De Mão: " + super.toString();
    }
}
