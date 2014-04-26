package service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;



public interface crudServices <S, ID>
{
    public S find(ID id);
    
    public S perist (S entity);
    
    public S move (S entity);
    
    public S remove (S entity);
    
    public List<S> findAll();
}
