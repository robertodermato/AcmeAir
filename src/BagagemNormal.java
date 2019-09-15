public class BagagemNormal extends Bagagem{

    private static double custoPorKilo;

    public BagagemNormal(int peso, String descricao) {
        super(peso, descricao);
    }

    public static double getCustoPorKilo() {        return custoPorKilo;    }

    public static void setCustoPorKilo(double custoPorKilo) {        BagagemNormal.custoPorKilo = custoPorKilo;    }
    // observar que aqui não se usa this

    @Override
    public double getCusto() {
        if ((super.getPeso()-20)<=0) return 0;
        return (super.getPeso()-20)*custoPorKilo;
    }

    @Override
    public String toString() {
        return "Bagagem Normal - " + super.toString() + " - Custo: R$ " + getCusto();
    }
}
