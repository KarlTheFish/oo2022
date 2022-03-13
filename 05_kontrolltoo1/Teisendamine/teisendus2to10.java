import java.util.ArrayList;
import java.util.List;

public class teisendus2to10 {
    List<Integer> base2;

    public teisendus2to10(){
        double base10 = 0;
    }

    public double from2to10(List<Integer> base2) {
        double base10 = 0;
        for (int i = 0; i < (base2.size()); i++) {
            base10 = base10 + (base2.get(i) * Math.pow((double) 2, (base2.size() - (i + 1))));
        }
        return base10;
    }
}
