import java.util.ArrayList;
import java.util.Collections;

public class TesteDoProfessor {

    public static void main(String[] args) {

        Bagagem.setCustoExcesso(30);

        Bagagem b1 = new BagagemDeMao(30, "Huguinho");
        Bagagem b2 = new BagagemNormal(32, "Zezinho");

        if (b1.compareTo(b2) != 0) {
            System.out.println("b1 e b2 não tem o mesmo peso");
        }


        ArrayList<Bagagem> lista = new ArrayList<>();

        lista.add(b1);
        lista.add(b2);
        lista.add(new BagagemDeMao(7, "Luizinho"));
        lista.add(new BagagemNormal(24, "Patinhas"));
        lista.add(new BagagemDeMao(17, "Donald"));
        lista.add(new BagagemDeMao(217, "John Smith"));
        lista.add(new BagagemNormal(27, "Margarida"));

        Collections.sort(lista);

        for (Bagagem b : lista) {
            System.out.println(b);
        }


        System.out.println("Listagem apenas das bagagens de mao:");
        int mao = 0;
        for (Bagagem b : lista) {
            if (b instanceof BagagemDeMao) {
                BagagemDeMao bm = (BagagemDeMao) b;
                System.out.println(b);
                System.out.println("\tAutorizado por: " + bm.getAutorizacao());
                mao++;
            }
        }
        System.out.println("Total de mão: " + mao);


        Collections.sort(lista, new ComparadorCustoBagagem());
        System.out.println("\nOrdenado pelo valor...\n");
        for (Bagagem b : lista) {
            System.out.println(b);
        }


        lista.sort((Bagagem o1, Bagagem o2) -> o2.getDescricao().compareTo(o1.getDescricao()));
        System.out.println("\nOrdenado pela descricao decrescente com lambda\n");
        for (Bagagem b : lista) {
            System.out.println(b);
        }

        int total = 0;
        for (Bagagem b : lista) {
            if (b instanceof BagagemDeMao) {
                // se eu precisasse usar métodos específicos de Bagagem de mão
                // faria um "casting" e trabalharia com a variável bm
                //BagagemDeMao bm = (BagagemDeMao) b;
                total = total + 1;
            }
        }
        System.out.println("\nTotal de bagagens de mão: " + total);


        System.out.println("Bagagens criadas: " +
                Bagagem.getTotalBagagens());
    }
}