/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import model.Impl.berryImpl;
import model.berry;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;
import service.crud.crudBerry;

/**
 *
 * @author Calen
 */
public class berryCrudTest {
    
    public berryCrudTest() {
    }
    @Mock
    crudBerry crudService;

   

    @BeforeClass
    public void setUp() throws Exception 
    {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(crudBerry.class);
        
    }
    
    @Test
    public void testCreate() throws Exception
            {
               berryImpl b1 = new berryImpl.Builder("1").flavour("Sweet").texture("Orange").size(4).build();
               berry returnBerry = crudService.perist(b1);
               when(crudService.perist(b1)).thenReturn(returnBerry);
               Mockito.verify(crudService).perist(b1);              
            }
    
    @Test
    public void testRead() throws Exception
    {
       berryImpl b1 = new berryImpl.Builder("1").flavour("Sweet").texture("Orange").size(4).build();
       berry returnBerry = crudService.find(b1.getFlavour());
       when(crudService.find(b1.getFlavour())).thenReturn(returnBerry);
       Mockito.verify(crudService).find(b1.getFlavour());
    }
    
    @Test
    public void testDelete() throws Exception{
    berryImpl b1 = new berryImpl.Builder("1").flavour("Sweet").texture("Orange").size(4).build();
    berry returnBerry = crudService.remove(b1);
    when(crudService.remove(b1)).thenReturn(returnBerry);
    Mockito.verify(crudService).remove(b1);
    }

 
}
