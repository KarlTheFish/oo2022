import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuguTest {

    @Test
    public void MIDItoTäht(){
        Kolmkõla kolmkõla = new Kolmkõla(60, "C");
        Assert.assertEquals("C",kolmkõla.MIDItoTäht());
    }

    @Test
    public void TähtToMIDI(){
        Kolmkõla kolmkõla = new Kolmkõla(60, "C");
        Assert.assertEquals(60, kolmkõla.TähtToMIDI());
    }

    @Test
    public void LauluAkordidTäht(){
        List<String> test1 = new ArrayList<>(Arrays.asList("C", "E", "D"));
        Lugu lugu = new Lugu(test1, true);
        Assert.assertEquals(, lugu.Takt(true));
    }

    @Test
    public void LauluAkordidNumber(){
        List<String> test1 = new ArrayList<>(Arrays.asList("C", "E", "D"));
        Lugu lugu = new Lugu(test1, false);
        Assert.assertEquals(, lugu.Takt(false));
    }
}
