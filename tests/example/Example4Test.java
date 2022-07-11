package example;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example4Test {

    @Test
    public void saveCorectTest4() throws IOException {

        int[] eIntArray = {1, 2, 3, 4};
        int[] dIntArray = {4, 3, 2, 1,};

        String[] eStringArray ={"a", "b", "c"};
        String[] dStringArray ={"c", "b", "a"};
        String filemane="exampleCorectSave4";

        Example4 exSave4 = new Example4(eIntArray, eStringArray);
        exSave4.save2File(filemane);

        Example4 exRead4 = new Example4(dIntArray, dStringArray);
        exRead4.restoreFromFile(filemane);

        Assert.assertArrayEquals(eIntArray, exRead4.getIntValues());
        Assert.assertArrayEquals(eStringArray, exRead4.getStringValues());

    }

    @Test(expected = FileNotFoundException.class)
    public void saveIncorectTest4() throws IOException {

        String[] dStringArray ={"c", "b", "a"};
        int[] dIntArray = {4, 3, 2, 1,};
        String filename4="example4Incorect";

        Example4 exRead4 = new Example4(dIntArray, dStringArray);
        exRead4.restoreFromFile(filename4);
        }
}
