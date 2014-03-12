/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.trainerImpl;

/**
 *
 * @author Calen
 */
public class trainerTest {
    
    public trainerTest() {
    }
    
    public static trainerImpl trainer1;
    public static trainerImpl trainer1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void trainerIntialize()
     {
         trainer1=new trainerImpl.Builder("1").name("Ash").surname("Ketchum").age(13).build();
         Assert.assertEquals("Ash", trainer1.getName());
     }
     
     @Test
     public void trainerUpdate()
     {
         trainer1Update=new trainerImpl.Builder("1").age(12).build();
         Assert.assertEquals(12, trainer1Update.getAge());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
