package example;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2Test {

    @Test
    public void saveCorectTest2() throws IOException {

        int eInt = 2;
        int dInt = 1;

        String filename="example2Corect";
        String eString = "HI!";
        String dString = "Moin!";

        Example2 exSave2 = new Example2(eInt, eString);
        exSave2.save2File(filename);

        Example2 exRead2 = new Example2(dInt, dString);
        exRead2.restoreFromFile(filename);

        Assert.assertEquals(eInt, exRead2.getIntValue());
        Assert.assertEquals(eString, exRead2.getStringValue());
    }

    @Test(expected = FileNotFoundException.class)
    public void saveIncorectTest2() throws IOException {

        String dString="gg";
        int dInt=-2;
        String filename2="example2Incorect";

        Example2 exRead2 = new Example2(dInt, dString);
        exRead2.restoreFromFile(filename2);

    }
}
