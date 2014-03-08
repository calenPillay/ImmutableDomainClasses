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
import service.daycareStaffImpl;

/**
 *
 * @author Calen
 */
public class daycareStaffTest {
    
    public daycareStaffTest() {
    }
    public static daycareStaffImpl daycareStaff1;
    public static daycareStaffImpl daycareStaff1Update;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void daycareStaffInitialization()
    {
        daycareStaff1= new daycareStaffImpl.Builder(1).name("Joy").speciality("Breeder").salary(2500.00).build();
        Assert.assertEquals(daycareStaff1.getName(),"Joy");
    }
    
    @Test
    public void daycareStaffUpdate()
    {
        daycareStaff1Update= new daycareStaffImpl.Builder(1).name("Jenny").build();
        Assert.assertEquals(daycareStaff1Update.getName(),"Jenny");
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
