/*
Na classe BagagemDeMao, apresente a implementação do método getCusto, considerando as
seguintes regras: bagagens até 5 kg são isentas; entre 5 kg e 10 kg (inclusive) cobra-se R$ 10,00 por kg
que exceda os 5 kg; e acima de 10 kg cobra-se R$ 20,00 por kg que exceda os 5 kg.
 */

public class BagagemDeMao extends Bagagem {

    public BagagemDeMao(int peso, String descricao) {
        super(peso, descricao);
    }

    @Override
    public double getCusto() {
        if (super.getPeso()<=5) return 0;
        if (super.getPeso()>5 && super.getPeso()<=10) return 10*(super.getPeso()-5);
        return 20*(super.getPeso()-5);
    }

    @Override
    public String toString() {
        return "Bagagem De Mão: " + super.toString() + " - Custo: R$ " + getCusto();
    }
}
