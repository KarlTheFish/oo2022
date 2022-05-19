import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Kolmkõla {

    int pohitoon;
    String täht;
    int MIDIvalue = 100;
    List<String> Tähed = new ArrayList<>(Arrays.asList("C","C#","D","Eb","E","F","F#","G","G#","A","B","H"));

    public Kolmkõla(int pohitoon, String täht){
        this.pohitoon = pohitoon;
        this.täht = täht;
    }

    public List<Integer> Toonid(){
        List<Integer> Toonid = new ArrayList<>();
        Toonid.add(pohitoon);
        Toonid.add(pohitoon + 4);
        Toonid.add(pohitoon + 7);
        return Toonid;
    }

    public int TähtToMIDI(){
        int i = 0;
        while(MIDIvalue == 100){
            if(Objects.equals(Tähed.get(i), täht)){
                MIDIvalue = i + 60;
                break;
            }
            else{
                i = i + 1;
            }
        }
        return MIDIvalue;
    }

    public String MIDItoTäht(){
        if((pohitoon - 60) > 12){
            täht = Tähed.get(pohitoon - 72);
        }
        else {
            täht = Tähed.get(pohitoon - 60);
        }
        return täht;
    }

    public List<String> TähtAkord(String täht){
        List<String> TähtAkord = new ArrayList<>();
        List<Integer>noodid = Toonid();
        for (int i = 0; i < Toonid().size(); i++) {
            pohitoon = noodid.get(i);
            TähtAkord.add(MIDItoTäht());
        }
        return TähtAkord;
    }
}
