package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest extends BaseTest{

    @Test
    public void verifyLogin(){
        // Hard - Soft

//        System.out.println("Test1");
//        // Hard Assertion
//        Assert.assertTrue(false); // failed
//        System.out.println("Test2");


        System.out.println("Test1");

        // Soft-Assertion
        soft.assertTrue(false);

        System.out.println("Test2");

        Assert.assertTrue(false); // EXIT

        System.out.println("Test3");
    }

}
