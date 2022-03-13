import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teisendus {
    public static void main(String[] args) {
        List<Integer> baas2 = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 0));
        List<Integer> baas8 = new ArrayList<>(Arrays.asList(6, 6));
        List<String> baas16 = new ArrayList<>((Arrays.asList("D", "5", "1")));

        //kümnendsüsteemist kahendsüsteemi
        teisendus10to2 naide1 = new teisendus10to2();
        System.out.println("Arv 42(binaarsüsteemis):" + naide1.binaar(42));

        //kümnendsüsteemist kaheksandiksüsteemi
        teisendus10to8 naide2 = new teisendus10to8();
        System.out.println("Arv 42(kaheksandiksüsteemis):" + naide2.toBase8(42));

        //kümnendsüsteemist kuusteistsüsteemi
        teisendus10to16 naide3 = new teisendus10to16();
        System.out.println("Arv 42(kuusteistsüsteemis):" + naide3.toBase16(42));

        //kahendsüsteemist kümnendsüsteemi
        teisendus2to10 naide4 = new teisendus2to10();
        System.out.println("Arv 1001(kümnendsüsteemis):" + naide4.from2to10(baas2));

        //kaheksandiksüsteemist kümnendsüsteemi
        teisendus8to10 naide5 = new teisendus8to10();
        System.out.println("Arv 66(Kaheksandiksüsteemist kümnendsüsteemi)" + naide5.from8to10(baas8));

        //kuueteistkümnendsüsteemist kümnendsüsteemi
        teisendus16to10 naide6 = new teisendus16to10();
        System.out.println("Arv D51(kümnendsüsteemis):" + naide6.from16to10(baas16));

        //kahendsüsteemist kaheksandiksüsteemi
        teisendus2to10 naide71 = new teisendus2to10();
        teisendus10to8 naide72 = new teisendus10to8();
        System.out.println("binaarsüsteemist kaheksandiksüsteemi:" + naide72.toBase8((int) naide71.from2to10(baas2)));

        //kahendsüsteemist kuusteistsüsteemi
        teisendus2to10 naide81 = new teisendus2to10();
        teisendus10to16 naide82 = new teisendus10to16();
        System.out.println("Binaarsüsteemist kuusteistsüsteemi: " + naide82.toBase16((int)naide81.from2to10(baas2)));

        //kaheksandiksüsteemist kahendsüsteemi
        teisendus8to10 naide91 = new teisendus8to10();
        teisendus10to2 naide92 = new teisendus10to2();
        System.out.println("Kaheksandiksüsteemist binaari: " + naide92.binaar((int)naide91.from8to10(baas8)));

        //kaheksandiksüsteemist kuusteistsüsteemi
        teisendus16to10 naide101 = new teisendus16to10();
        teisendus10to16 naide102 = new teisendus10to16();
        System.out.println("Kaheksandiksüsteemist kuusteistsüsteemi: " + naide102.toBase16((int)naide101.from16to10(baas16)));

        //kuusteistsüsteemist binaari
        teisendus16to10 naide111 = new teisendus16to10();
        teisendus10to2 naide112 = new teisendus10to2();
        System.out.println("Kuusteistsüsteemist binaari: " + naide112.binaar((int)naide111.from16to10(baas16)));

        //kuusteistsüsteemist kaheksandiksüsteemi
        teisendus10to8 naide121 = new teisendus10to8();
        teisendus16to10 naide122 = new teisendus16to10();
        System.out.println("Kuusteistsüsteemist kaheksandiksüsteemi: " + naide121.toBase8((int)naide122.from16to10(baas16)));
    }
}
