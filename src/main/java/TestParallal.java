//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//public class TestParallal {
//    @BeforeMethod
//    public void beforeMethod() {
//        long id = Thread.currentThread().getId();
//        System.out.println("Before test-method. Thread id is: " + id);
//    }
//
//    @Test
//    public void testMethodsOne() {// 1min
//        long id = Thread.currentThread().getId();
//        System.out.println("Simple test-method One. Thread id is: " + id);
//    }
//
//    @Test
//    public void testMethodsTwo() {// 1min
//        long id = Thread.currentThread().getId();
//        System.out.println("Simple test-method Two. Thread id is: " + id);
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        long id = Thread.currentThread().getId();
//        System.out.println("After test-method. Thread id is: " + id);
//    }
//
//}
