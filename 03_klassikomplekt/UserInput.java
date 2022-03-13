import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UserInput {
    int A;
    int B;
    String input;

    public void TextInput(){
        System.out.println("Millist tehet soovite teha? Liitmine/Lahutamine/Korrutamine/Jagamine");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        if(Objects.equals(input, "Liitmine")){
            System.out.println("Sisestage arvud");
            input = scanner.nextLine();
            A = parseInt(input);
            input = scanner.nextLine();
            B = parseInt(input);
            Liitmine tehe = new Liitmine(A, B);
            System.out.println("Vastus on " + tehe.Liida(A, B));

        }
        if(Objects.equals(input, "Lahutamine")){
            System.out.println("Sisestage arvud");
            input = scanner.nextLine();
            A = parseInt(input);
            input = scanner.nextLine();
            B = parseInt(input);
            Lahutamine tehe = new Lahutamine(A, B);
            System.out.println("Vastus on " + tehe.Lahuta(A, B));
        }
        if(Objects.equals(input, "Korrutamine")){
            System.out.println("Sisestage arvud");
            input = scanner.nextLine();
            A = parseInt(input);
            input = scanner.nextLine();
            B = parseInt(input);
            Korrutamine tehe = new Korrutamine(A, B);
            System.out.println("Vastus on " + tehe.Korruta(A, B));

        }
        if(Objects.equals(input, "Jagamine")){
            System.out.println("Sisestage arvud");
            input = scanner.nextLine();
            A = parseInt(input);
            input = scanner.nextLine();
            B = parseInt(input);
            Jagamine tehe = new Jagamine(A, B);
            System.out.println("Vastus on " + tehe.Jaga(A, B));

        }
    }
}
