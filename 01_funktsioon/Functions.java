import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        System.out.println("Sisestage 1. arv");
        int x = Convert();
        System.out.println("Sisestage 2. arv");
        int y = Convert();
        System.out.println("Vastus on " + Add(x,y));
        System.out.println("Kahe arvu jagatis on " + Divide(x,y));


    }

    public static int Add(int x, int y){ //funktsioon kahe arvu kokkuliitmiseks
        return x + y;
    }

    public static int Convert(){ //funktsioon, mis tuvastab kasutaja sisestatud asja ja teeb selle integeriks
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }

    public static float Divide(float x, float y){ //funktsioon, mis kahte arvu jagab
        return x / y;
    }

}
