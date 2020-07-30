import org.junit.Test;
import org.junit.Assert;


public class Problem05Test {

    @Test
    public void biggerIsGreaterTest(){
        Problem05 problem05 = new Problem05();
        String input = "ab";
        String expected = "ba";
        String actual = Problem05.biggerIsGreater(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void biggerIsGreater2Test(){
        Problem05 problem05 = new Problem05();
        String input = "bb";
        String expected = "no answer";
        String actual = Problem05.biggerIsGreater2(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void biggerIsGreater3Test(){
        Problem05 problem05 = new Problem05();
        String input = "hefg";
        String expected = "hegf";
        String actual = Problem05.biggerIsGreater3(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void biggerIsGreater4Test(){
        Problem05 problem05 = new Problem05();
        String input = "dhck";
        String expected = "dhkc";
        String actual = Problem05.biggerIsGreater4(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void biggerIsGreater5Test(){
        Problem05 problem05 = new Problem05();
        String input = "dkhc";
        String expected = "hcdk";
        String actual = Problem05.biggerIsGreater5(input);
        Assert.assertEquals(expected,actual);
    }

}
