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
import service.machineImpl;

/**
 *
 * @author Calen
 */
public class machineTest {
    
    public machineTest() {
    }
    
    public static machineImpl machine1;
    public static machineImpl machine1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void machine1Intialization()
    {
        machine1=new machineImpl.Builder(1).location("ER Room 1").yearsOfService(2).build();
        Assert.assertEquals(machine1.getLocation(), "ER Room 1");
    }
    
    @Test
    public void machine1Update()
    {
        machine1Update= new machineImpl.Builder(1).location("ER Room 3").build();
        Assert.assertEquals(machine1Update.getLocation(),"ER Room 3");
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
