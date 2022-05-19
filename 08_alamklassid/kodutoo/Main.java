package kodutoo;

public class Main {
    public static void main(String[] args){
        Hammer hammer = new Hammer();
        hammer.Use();
        hammer.Build();

        Sword sword = new Sword();
        sword.Slash();
        sword.Attack();
    }
}
