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
import service.hmMovesImpl;

/**
 *
 * @author Calen
 */
public class hmMovesTest {
    
    public hmMovesImpl hmMove1;
    public hmMovesImpl hmMove1Update;
    public hmMovesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hmMoveIntialize()
    {
        hmMove1=new hmMovesImpl.Builder(1).name("Cut").benefit("Cuts trees").price(10000.00).build();
        Assert.assertEquals(hmMove1.getName(),"Cut");
    }
    
    
    @Test
    public void hmMoveUpdate()
    {
        hmMove1Update=new hmMovesImpl.Builder(1).name("Surf").build();
        Assert.assertEquals(hmMove1Update.getName(), "Surf");
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
