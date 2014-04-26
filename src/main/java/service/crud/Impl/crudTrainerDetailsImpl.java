/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.crud.Impl;

import model.trainerDetails;
import service.crud.crudTrainerDetails;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudTrainerDetailsImpl implements crudTrainerDetails
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public trainerDetails find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public trainerDetails perist(trainerDetails entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public trainerDetails move(trainerDetails entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public trainerDetails remove(trainerDetails entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<trainerDetails> findAll() 
    {
    return null;   
    }
}
