import org.junit.*;


public class TestingTest {

    public void myTestMethod() {

        System.out.println("Hello World");

    }
     @BeforeClass
    public static  void  method1() {
        System.out.println("Before Class");
    }
    @Before
    public void method2() {
        System.out.println("Before test");
    }
    @Test
    public void method3() {
        System.out.println("Test 1");
        System.out.println("Hello World");
    }
    @Test
    public void method4() {
        System.out.println("Test 2");
    }
    @After
    public void method6() {
        System.out.println("After test");
    }
    @AfterClass
    public static void method7() {
        System.out.println("After class");
    }


}