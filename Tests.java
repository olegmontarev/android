public class Tests {

    @BeforeSuite
    public void before(){
        System.out.println("Before");
    }

    @Testing(priority = 1)
    public void test(){
        System.out.println("Test");
    }

    @Testing(priority = 2)
    public void test1(){
        System.out.println("Test1");
    }

    @Testing(priority = 3)
    public void test2(){
        System.out.println("Test2");
    }

    @AfterSuite
    public void after(){
        System.out.println("After");
    }

}