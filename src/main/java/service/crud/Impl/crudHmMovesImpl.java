/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.crud.Impl;

import model.hmMoves;
import service.crud.crudHmMoves;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Calen
 */
public class crudHmMovesImpl implements crudHmMoves 
{
    @Override
    @Transactional (propagation=Propagation.SUPPORTS )
    public hmMoves find(String id) 
    {
      return null;
    }
    
    @Override
    @Transactional(propagation=Propagation.MANDATORY)
    public hmMoves perist(hmMoves entity) 
    {
        return null;
    }

    @Override
    @Transactional (propagation=Propagation.REQUIRES_NEW)
    public hmMoves move(hmMoves entity) 
    {
        return null;
    }
    
    @Override
    @Transactional (propagation=Propagation.REQUIRED)
    public hmMoves remove(hmMoves entity)
    {
        return null;
    }
    
    @Override
    @Transactional (propagation =Propagation.NOT_SUPPORTED)
    public List<hmMoves> findAll() 
    {
    return null;   
    }
}
