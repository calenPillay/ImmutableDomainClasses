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
import model.Impl.tmMovesImpl;

/**
 *
 * @author Calen
 */
public class tmMovesTest {
    
    public static tmMovesImpl tmMove1;
    public static tmMovesImpl tmMove1Update;
    public tmMovesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void tmMoveIntialize()
    {
        tmMove1=new tmMovesImpl.Builder(1).name("Fury Swipes").description("Strikes the opponent 5 times furiously").price(3000.00).build();
        Assert.assertEquals(tmMove1.getName(),"Fury Swipes");
    }
    
    @Test
    public void tmMoveUpdate()
    {
        tmMove1Update= new tmMovesImpl.Builder(1).name("Bonus swipes").build();
        Assert.assertEquals(tmMove1Update.getName(), "Bonus swipes");
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
