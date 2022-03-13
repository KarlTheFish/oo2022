import java.util.ArrayList;
import java.util.List;

public class teisendus8to10 {
    List<Integer> base8;

    public teisendus8to10(){
        double base10 = 0;
    }

    public double from8to10(List<Integer> base8) {
        double base10 = 0;
        for (int i = 0; i < (base8.size()); i++) {
            base10 = base10 + (base8.get(i) * Math.pow((double) 8, (base8.size() - (i + 1))));
        }
        return base10;
    }
}
