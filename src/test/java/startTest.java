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
import model.Impl.startImpl;

/**
 *
 * @author Calen
 */
public class startTest {
    
    public static startImpl starter1;
    public static startImpl start1Update;
    public startTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void starter1Intialize()
    {
        starter1=new startImpl.Builder("1").name("Squirtle").nick("Squirt").level(6).build();
        Assert.assertEquals(starter1.getRealName(),"Squirtle");
        
    }
    
    @Test
    public void starter1Update()
    {
        start1Update= new startImpl.Builder("1").name("Charmander").build();
        Assert.assertEquals(start1Update.getRealName(), "Charmander");
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
