/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config.crudService.Impl;
import config.crudService.crudDaycareStaff;
import config.daycareStaff;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudDaycareStaffImpl implements crudDaycareStaff 
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public daycareStaff find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public daycareStaff perist(daycareStaff entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public daycareStaff move(daycareStaff entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public daycareStaff remove(daycareStaff entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<daycareStaff> findAll() 
    {
    return null;   
    }
}
