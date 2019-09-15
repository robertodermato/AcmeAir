public class AppBagagem {
    public static void main (String args[]){
        ListaDeBagagens lista = new ListaDeBagagens();

        Bagagem mao1 = new BagagemDeMao(7, "Mochila");
        Bagagem mao2 = new BagagemDeMao(4, "Bolsa");
        Bagagem mao3 = new BagagemDeMao(2, "Pochete");
        Bagagem mao4 = new BagagemDeMao(9, "Malinha");

        Bagagem fragil1 = new BagagemFragil(12, "Prancha surf", 300);
        Bagagem fragil2 = new BagagemFragil(20, "Caixa de copos de vidro", 800);
        Bagagem fragil3 = new BagagemFragil(320, "Piano", 8000);

        Bagagem normal1 = new BagagemNormal(22, "Roupas 1");
        Bagagem normal2 = new BagagemNormal(27, "Roupas 2");
        Bagagem normal3 = new BagagemNormal(24, "Roupas 3");
        Bagagem normal4 = new BagagemNormal(32, "Roupas 4");

        lista.add(mao1);
        lista.add(mao2);
        lista.add(mao3);
        lista.add(mao4);

        lista.add(fragil1);
        lista.add(fragil2);
        lista.add(fragil3);

        lista.add(normal1);
        lista.add(normal2);
        lista.add(normal3);
        lista.add(normal4);

        System.out.println(lista);

        System.out.println("Lista ordenada por peso:\n");
        lista.ordenaPorPeso();
        System.out.println(lista);

        System.out.println("\nTotal de bagagens: " + Bagagem.getTotalBagagens());
    }
}
