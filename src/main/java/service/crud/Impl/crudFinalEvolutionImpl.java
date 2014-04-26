/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.crud.Impl;

import model.finalEvolution;
import service.crud.crudFinalEvolution;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudFinalEvolutionImpl implements crudFinalEvolution
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public finalEvolution find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public finalEvolution perist(finalEvolution entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public finalEvolution move(finalEvolution entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public finalEvolution remove(finalEvolution entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<finalEvolution> findAll() 
    {
    return null;   
    }
}
