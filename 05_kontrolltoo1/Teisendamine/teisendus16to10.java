import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class teisendus16to10 {
    List<Integer> base16;
    boolean found = false;
    int j = 0;

    public teisendus16to10(){
        double base10 = 0;
    }

    public double from16to10(List<String> base16) {
        List<String>base16values = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8","9","A", "B", "C", "D", "E", "F"));
        double base10 = 0;
        for (int i = 0; i < base16.size(); i++) {
            found = false;
                j = 0;
                while (!found) {
                    if ((Objects.equals(base16.get(i), base16values.get(j)))) {
                        found = true;
                        break;
                    } else {
                        j = j + 1;
                    }
                }
                base10 += j * Math.pow((double) 16, base16.size() - (i + 1));
        }
        return base10;
    }
}
