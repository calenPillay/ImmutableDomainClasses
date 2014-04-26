/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Impl;

import model.egg;

/**
 *
 * @author Calen
 */
public class eggImpl implements egg 
{
    
    private int id;
    private int weight;
    private String parents;
    
    public String eggDetails(int weight, String parents)
    {
        return "Weight: "+weight+" Parents: "+parents;
    }
    
    private eggImpl(){};
    
    private eggImpl(Builder build)
    {
        id=build.id;
        weight=build.weight;
        parents=build.parents;
    }
    
      public static class Builder
    {
        private int id;
        private int weight;
        private String parents;
        
        public Builder()
        {
        }
        
        public Builder (int id)
        {
            this.id=id;
        }
        
        public Builder weight(int value)
        {
            weight=value;
            return this;
        }
        
        public Builder parents(String value)
        {
            parents=value;
            return this;
        }
        
       
        
        public eggImpl build()
        {
            return new eggImpl (this);
        }
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public String getParents() {
        return parents;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.weight;
        hash = 67 * hash + (this.parents != null ? this.parents.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final eggImpl other = (eggImpl) obj;
        return true;
    }
    
    
}
