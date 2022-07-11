package example;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1Test {
    @Test
    public void saveGutTest1() throws IOException {
        int exampleInt= 12;
        int dummyInt=-12;
        String filename="example1GutTestFile";

        Assert.assertNotEquals(exampleInt, dummyInt);

        Example1 exaSave = new Example1(exampleInt);
        exaSave.save2File(filename);

        Example1 exaRead = new Example1(dummyInt);
        exaRead.restoreFromFile(filename);

        Assert.assertEquals(exampleInt, exaRead.getValue());
    }
    @Test(expected = FileNotFoundException.class)
    public void saveSchlechtTest1() throws IOException {

        int exampleInt= 11;
        int dummyInt=-2;
        String filename2="example2GutTestFile";

        Example1 exaRead = new Example1(dummyInt);
        exaRead.restoreFromFile(filename2);

    }

}
