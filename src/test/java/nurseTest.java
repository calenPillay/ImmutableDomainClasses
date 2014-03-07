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
import service.nurseImpl;

/**
 *
 * @author Calen
 */
public class nurseTest {
    
    public nurseTest() {
    }
    
    public static nurseImpl nurse1;
    public static nurseImpl nurse1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void nurse1Intialize()
    {
        nurse1=new nurseImpl.Builder("1").name("Joy").surname("Jenny").pay(5000.000).build();
        Assert.assertEquals(nurse1.getName(), "Joy");
    }
    
    @Test
    public void nurse1Update()
    {
        nurse1Update=new nurseImpl.Builder("1").name("Jennifer").build();
        Assert.assertEquals(nurse1Update.getName(),"Jennifer");
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
