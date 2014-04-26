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
import model.Impl.potionImpl;

/**
 *
 * @author Calen
 */
public class potionTest {
    
    public potionTest() {
        
        
    }
    
    public static potionImpl potion1;
    public static potionImpl potion1Update;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void potionIntialize() 
    {
        potion1=new potionImpl.Builder("1").name("Super Potion").effect("Heals for 200HP").cost(200).build();
        Assert.assertEquals(potion1.getName(),"Super Potion");
    }
    
    @Test
    public void potionUpdate()
    {
        potion1Update= new potionImpl.Builder("1").effect("Heals for 300HP").build();
        Assert.assertEquals(potion1Update.getEffect(), "Heals for 300HP");
        
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
