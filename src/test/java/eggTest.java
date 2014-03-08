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
import service.eggImpl;

/**
 *
 * @author Calen
 */
public class eggTest
{
    
    public eggTest() {
    }
    
    public static eggImpl egg1;
    public static eggImpl egg1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void egg1Intialization()
    {
        egg1= new eggImpl.Builder(1).weight(3).parents("Pikachu's").build();
        Assert.assertEquals(egg1.getWeight(), 3);
    }
    
    @Test
    public void egg1Update()
    {
        egg1Update=new eggImpl.Builder(1).weight(2).build();
        Assert.assertEquals(egg1Update.getWeight(),2);
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
