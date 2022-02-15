import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String y = input.nextLine();
        int answer = Add(x,y);
        System.out.println(answer);
        
    }

    public static int Add(int x, int y){
        int answer = x + y;
        return answer;
    }
}
