package kanga;

import org.junit.Assert;
import org.junit.Test;

public class testKangaroo {
    @Test
    public void testKangarooMeet() {
        Integer x1 = 0;
        Integer v1 = 4;
        Integer x2 = 3;
        Integer v2 = 2;
        String actual = Kangaroo.kangarooMeet(x1, x2, v1, v2);
        String expected = "no";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testKangarooMeet2() {
        Integer x1 = 0;
        Integer v1 = 3;
        Integer x2 = 3;
        Integer v2 = 2;
        String actual = Kangaroo.kangarooMeet(x1, x2, v1, v2);
        String expected = "yes";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testKangarooMeet3() {
        Integer x1 = 0;
        Integer v1 = 4;
        Integer x2 = 4;
        Integer v2 = 2;
        String actual = Kangaroo.kangarooMeet(x1, x2, v1, v2);
        String expected = "yes";
        Assert.assertEquals(expected, actual);
    }
}
