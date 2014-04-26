/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.crud.Impl;

import model.startPokemon;
import service.crud.crudStartPokemon;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudStartPokemonImpl implements crudStartPokemon
{
        @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public startPokemon find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public startPokemon perist(startPokemon entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public startPokemon move(startPokemon entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public startPokemon remove(startPokemon entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<startPokemon> findAll() 
    {
    return null;   
    }
}
