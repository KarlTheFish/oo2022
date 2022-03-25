import Kujundid.Kolmnurk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoTest {

    @Test
    public void test1(){
        Kolmnurk kolmnurk = new Kolmnurk(3.0, 4.0, 5.0);
        assertEquals(6, kolmnurk.pindala());
    }
}
