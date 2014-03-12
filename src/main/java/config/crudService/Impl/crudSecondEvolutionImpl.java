/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config.crudService.Impl;

import config.secondEvolution;
import config.crudService.crudSecondEvolution;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudSecondEvolutionImpl implements crudSecondEvolution 
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public secondEvolution find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public secondEvolution perist(secondEvolution entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public secondEvolution move(secondEvolution entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public secondEvolution remove(secondEvolution entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<secondEvolution> findAll() 
    {
    return null;   
    }
    
}
