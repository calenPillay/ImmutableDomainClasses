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
import model.Impl.finalEvoImpl;

/**
 *
 * @author Calen
 */
public class finalEvoTest {
    
    public finalEvoTest() {
    }
    
    public static finalEvoImpl finalForm1;
    public static finalEvoImpl finalForm1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void finalFormIntitialize()
   {
       finalForm1=new finalEvoImpl.Builder(1).name("Charizard").nature("Fierce").level(36).build();
       Assert.assertEquals(finalForm1.getNature(), "Fierce");
   }
   
   @Test 
   public void finalFormUpdate()
   {
       finalForm1Update=new finalEvoImpl.Builder(1).name("Blastoise").build();
       Assert.assertEquals(finalForm1Update.getName(), "Blastoise");
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
