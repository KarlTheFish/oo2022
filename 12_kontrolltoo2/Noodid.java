import java.util.List;
import java.util.Objects;

public class Noodid {
    String noot;
    List<Integer> akord;

    public Noodid(String noot) {
        this.noot = noot;
    }

    public List<Integer> TaktiNoodid(){
        if(Objects.equals(noot, "C")){
            CKolmKõla cKolmKõla = new CKolmKõla(60, "C");
            akord = cKolmKõla.Toonid();
        }
        if(Objects.equals(noot, "F")){
            FKolmKõla fKolmKõla = new FKolmKõla(65, "F");
            akord = fKolmKõla.Toonid();
        }
        if(Objects.equals(noot, "G")){
            GKolmKõla gKolmKõla = new GKolmKõla(67, "G");
            akord = gKolmKõla.Toonid();
        }
        System.out.println(akord);
        return akord;
    }
}
