import Lesson_6.MassiveCheck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MassiveTest {

    MassiveCheck massiveCheck;

    @Before
    public void init() {
        System.out.println("init!");
        massiveCheck = new MassiveCheck();
    }

    @Test
    public void test1(){

        int[] arrayanother = new int[5];
        arrayanother[0] = 1;
        arrayanother[1] = 2;
        arrayanother[2] = 3;
        arrayanother[3] = 4;
        arrayanother[4] = 5;

        Assert.assertEquals(true, massiveCheck.chekingArray(arrayanother));}


    @Test
    public void test2(){

        int[] arraythree = new int[5];
        arraythree[0] = 0;
        arraythree[1] = 2;
        arraythree[2] = 0;
        arraythree[3] = 7;
        arraythree[4] = 8;

        Assert.assertEquals(true, massiveCheck.chekingArray(arraythree));}


    @Test
    public void test3(){

        int[] array= new int[5];
        array[0] = 0;
        array[1] = 2;
        array[2] = 1;
        array[3] = 7;
        array[4] = 8;

        Assert.assertEquals(true, massiveCheck.chekingArray(array));}
}