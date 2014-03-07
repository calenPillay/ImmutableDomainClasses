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
import service.berryImpl;

/**
 *
 * @author Calen
 */
public class berryTest {
    
    public berryTest() {
    }
    
    public berryImpl berry1; 
    public berryImpl berry1Update;

   
     @Test
     public void berry1Intialize()
     {
         berry1=new berryImpl.Builder("1").flavour("Sweet").texture("Orange").size(4).build();
         Assert.assertEquals(berry1.getFlavour(), "Sweet");
     }
     
     @Test
     public void berry1Update()
     {
         berry1Update=new berryImpl.Builder("1").flavour("Sour").build();
         Assert.assertEquals(berry1Update.getFlavour(), "Sour");
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
