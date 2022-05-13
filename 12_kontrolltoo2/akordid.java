public class akordid {
    public static void main(String[] args){
        Noodid noodid = new Noodid("G");
        noodid.TaktiNoodid();

        System.out.println("Kolmköla");
        Kolmkõla test = new Kolmkõla(60, "C");
        System.out.println(test.TähtAkord("C"));
    }
}
