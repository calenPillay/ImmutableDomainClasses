/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.crud.Impl;

import model.nurseDetails;
import service.crud.crudNurseDetails;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudNurseDetailsImpl implements crudNurseDetails 
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public nurseDetails find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public nurseDetails perist(nurseDetails entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public nurseDetails move(nurseDetails entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public nurseDetails remove(nurseDetails entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<nurseDetails> findAll() 
    {
    return null;   
    }
}
