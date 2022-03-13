import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class teisendus10to8 {
    int base10;
    List<Integer>powersOf8 = new ArrayList<>();
    List<Integer>base8 = new ArrayList<>();

    //construct
    public teisendus10to8(){
        //int base10 = input
        //List<Integer>powersOf2 = new ArrayList<>();
        List<Integer>base8 = new ArrayList<>();
    }

    //kaheksandiksüsteemist kahendsüsteemi
    public List<Integer> toBase8(int base10){
        while(base10 >= 1){
            base8.add(((int)base10 % 8));
            base10 = base10 / 8;
        }
        Collections.reverse(base8);
        return base8;
    }
}