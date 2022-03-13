import java.util.ArrayList;
import java.util.List;

public class teisendus10to2 {
    int base10;
    List<Integer>powersOf2 = new ArrayList<>();
    List<Integer>base2 = new ArrayList<>();

    //construct
    public teisendus10to2(){
        //int base10 = input
        //List<Integer>powersOf2 = new ArrayList<>();
        List<Integer>base2 = new ArrayList<>();
    }

    //Leidmine, mis 2 astmed mahuvad arvu sisse
    public List<Integer> astmed(int base10){
        boolean isLarger = false;
        int i = 0;
        while(!isLarger){
            int newPower = (int)Math.pow(2, i);
            if(newPower < base10){
                powersOf2.add(newPower);
                i = i + 1;
            }
            else{
                isLarger = true;
            }
        }
        return powersOf2;
    }

    //Lahutamine


    public List<Integer> binaar(int base10) {
        astmed(base10);
        for (int i = 0; i < powersOf2.size(); i++) {
            if((((double)base10) / (powersOf2.get(powersOf2.size() - (i + 1)))) >= 1 ){
                base2.add(1);
                base10 = base10 - powersOf2.get(powersOf2.size() - (i + 1));
            }
            else{
                base2.add(0);
            }
        }
        return base2;
    }
}
