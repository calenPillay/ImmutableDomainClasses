/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.secondEvoImpl;

/**
 *
 * @author Calen
 */
public class secondEvoTest {
    
    
    public static secondEvoImpl secondStage1;
    public static secondEvoImpl secondStage1Update;
    public secondEvoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void secondStageIntialize()
    {
        secondStage1= new secondEvoImpl.Builder(1).name("Charmeleon").skill("Burn").level(16).build();
        Assert.assertEquals("Charmeleon", secondStage1.getName());
    }
    
    @Test
    public void secondStageUpdate()
    {
        secondStage1Update=new secondEvoImpl.Builder(1).skill("Flame Thrower").build();
        Assert.assertEquals("Flame Thrower", secondStage1Update.getSkill());
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
