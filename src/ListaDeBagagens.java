import java.util.ArrayList;

public class ListaDeBagagens {

    private ArrayList<Bagagem> lista;
    private int contador;

    public ListaDeBagagens() {
        lista = new ArrayList<>();
    }

    public ListaDeBagagens(int tamanho) {
        lista = new ArrayList<>(tamanho);
    }

    public void add(Bagagem bag){
        lista.add(bag);
        contador++;
    }

    public int getContador() {        return contador;    }

    public ArrayList<Bagagem> getLista() {        return lista;    }

    public double getCustoTotal(){
        double custoTotal = 0;
        for (Bagagem bag: lista){
            custoTotal = custoTotal + bag.getCusto();
        }
        return custoTotal;
    }

    public double getTotalBagagensDeMao(){
        double custoTotalMao = 0;
        for (Bagagem bag: lista){
            if (bag instanceof BagagemDeMao) {custoTotalMao = custoTotalMao + bag.getCusto();}
        }
        return custoTotalMao;
    }

    public ArrayList<Bagagem> getBagagensDeMao(){
        ArrayList<Bagagem> handbags = new ArrayList<>();
        for (Bagagem bag: lista){
            if (bag instanceof BagagemDeMao) {handbags.add(bag);}
        }
        return handbags;
    }

    @Override
    public String toString() {
        String bags = "";
        for (Bagagem bag: lista){
            bags = bags + bag + "\n";
        }
        return "Lista De Bagagens\n" + bags;
    }
}
