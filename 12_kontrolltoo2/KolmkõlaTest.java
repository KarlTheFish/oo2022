import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KolmkõlaTest {

    @Test
    public void mazoorTest(){
        Kolmkõla duur = new Kolmkõla(60, "C");
        List<Integer> ExpectedResult = new ArrayList<>(Arrays.asList(60, 64, 67));
        Assert.assertEquals(duur.Toonid(), ExpectedResult);
    }




}
