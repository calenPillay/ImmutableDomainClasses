/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config.crudService.Impl;

import config.machineDetails;
import config.crudService.crudMachineDetails;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudMachineDetailsImpl implements crudMachineDetails 
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public machineDetails find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public machineDetails perist(machineDetails entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public machineDetails move(machineDetails entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public machineDetails remove(machineDetails entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<machineDetails> findAll() 
    {
    return null;   
    }
}
