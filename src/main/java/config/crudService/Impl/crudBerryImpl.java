/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config.crudService.Impl;

import config.berry;
import config.crudService.crudBerry;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudBerryImpl implements crudBerry  {

    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public berry find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public berry perist(berry entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public berry move(berry entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public berry remove(berry entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<berry> findAll() 
    {
    return null;   
    }
    
}
