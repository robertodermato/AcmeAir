import java.util.Comparator;

public class ComparadorCustoBagagem implements Comparator<Bagagem> {

    @Override
    public int compare(Bagagem o1, Bagagem o2) {
        if (o1.getCusto()>o2.getCusto()) return 1;
        if (o1.getCusto()<o2.getCusto()) return -1;
        return 0;
    }

}
