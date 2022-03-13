import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class teisendus10to16 {
    int base10;
    List<String>base16 = new ArrayList<>();

    //construct
    public teisendus10to16(){
        List<String>base8 = new ArrayList<>();
    }

    //kaheksandiksüsteemist kahendsüsteemi
    public List<String> toBase16(int base10){
        while(base10 >= 1){
            List<String>base16values = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8","9","A", "B", "C", "D", "E", "F"));
            base16.add((base16values.get(((int)base10 % 16))));
            base10 = base10 / 16;
        }
        Collections.reverse(base16);
        return base16;
    }
}