/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config.crudService.Impl;

import config.crudService.crudDaycare;
import config.daycare;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudDaycareImpl implements crudDaycare {

    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public daycare find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public daycare perist(daycare entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public daycare move(daycare entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public daycare remove(daycare entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<daycare> findAll() 
    {
    return null;   
    }
    
}
