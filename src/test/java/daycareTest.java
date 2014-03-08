/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.daycareImpl;

/**
 *
 * @author Calen
 */
public class daycareTest {
    
    public daycareTest() {
    }
    
    public daycareImpl daycarePkmn1;
    public daycareImpl daycarePkmn1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void daycareInitialization()
    {
        daycarePkmn1=new daycareImpl.Builder(1).name("Bulbasaur").age(2).level(8).price(2000.00).build();
        Assert.assertEquals(daycarePkmn1.getName(),"Bulbasaur");
    }
    
    @Test
    public void daycareUpdate()
    {
        daycarePkmn1Update= new daycareImpl.Builder(1).name("Muk").build();
        Assert.assertEquals(daycarePkmn1Update.getName(),"Muk");
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
