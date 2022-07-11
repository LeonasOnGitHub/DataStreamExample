package example;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example3Test {

    @Test
    public void saveCorectTest3() throws IOException {

        int[] eArray = {1, 2, 3, 4};
        int[] dArray = {4, 3, 2, 1,};
        String filename = "exampleCorectSave3";

        Example3 exSave3 = new Example3(eArray);
        exSave3.save2File(filename);

        Example3 exRead3 = new Example3(dArray);
        exRead3.restoreFromFile(filename);

        Assert.assertArrayEquals(eArray, exRead3.getIntValues());
    }

    @Test(expected = FileNotFoundException.class)
    public void saveIncorectTest2() throws IOException {

        int[] dArray = {4, 3, 2, 1,};
        String filename3="example3Incorect";

        Example3 exRead3 = new Example3(dArray);
        exRead3.restoreFromFile(filename3);

    }
}
