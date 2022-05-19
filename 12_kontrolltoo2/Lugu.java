import java.util.List;

public class Lugu {
    List<String> akordid;
    Boolean onTäht;


    public Lugu(List<String> akordid, boolean onTäht) {
        this.akordid = akordid;
        this.onTäht = onTäht;
    }

    public void Takt(boolean onTäht){
        for (int i = 0; i < akordid.size(); i++) {
            Kolmkõla kolmkõla = new Kolmkõla(60, akordid.get(i));
            kolmkõla.täht = akordid.get(i);
            kolmkõla.pohitoon = kolmkõla.TähtToMIDI();
            if(onTäht == true){
                System.out.println(kolmkõla.TähtAkord(akordid.get(i)));
            }
            else{
                System.out.println(kolmkõla.Toonid());
            }
        }

    }
}
