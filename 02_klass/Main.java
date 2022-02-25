public class Main {
    public static void main(String[] args) {

        Country Ukraine = new Country("Ukraine", 60, true);
        Country Russia = new Country("Russia", 3, true);

        Ukraine.countryStrong();
        Russia.countryStrong();

        System.out.println(Ukraine);
        System.out.println(Russia);


    }
}
