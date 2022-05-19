import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class akordid {
    public static void main(String[] args){

        List<String> test1 = new ArrayList<>(Arrays.asList("C", "E", "D"));
        Lugu lugu = new Lugu(test1, true);
        lugu.Takt(true);
        lugu.Takt(false);


    }
}
