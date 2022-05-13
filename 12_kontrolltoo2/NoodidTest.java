import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoodidTest {

    @Test
    public void Cduur(){
        Noodid noodid = new Noodid("C");
        List<Integer> Expected = new ArrayList<>(Arrays.asList(60, 64, 67));
        Assert.assertEquals(noodid.TaktiNoodid(), Expected);
    }

    @Test
    public void Fduur(){
        Noodid noodid = new Noodid("F");
        List<Integer> Expected = new ArrayList<>(Arrays.asList(64, 68, 71));
        Assert.assertEquals(noodid.TaktiNoodid(), Expected);
    }

    @Test
    public void Gduur(){
        Noodid noodid = new Noodid("G");
        List<Integer> Expected = new ArrayList<>(Arrays.asList(67, 71, 74));
        Assert.assertEquals(noodid.TaktiNoodid(), Expected);
    }
}
