/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.potions;

/**
 *
 * @author Calen
 */
public final class potionImpl implements potions 
{
    private String id;
    private String name;
    private String effect;
    private int cost;
    
    public String potionProperties(String name, String effect, int cost)
    {
        return "Name: "+name+" Effect: "+effect+ " Cost: "+cost;
    }
    
    private potionImpl()
    {
        
    }
    
    private potionImpl (Builder builder)
    {
        id=builder.id;
        name=builder.name;
        effect=builder.effect;
        cost=builder.cost;
    }
    
    public static class Builder
    {
        private String id;
        private String name;
        private String effect;
        private int cost;
        
        public Builder (String id)
        {
            this.id=id;
        }
        
        public Builder name(String value)
        {
            name=value;
            return this;
        }
        
        
        public Builder effect(String value)
        {
            effect=value;
            return this;
        }
        
        public Builder cost(int value)
        {
            cost =value;
            return this;
        }
        
        public potionImpl build()
        {
            return new potionImpl(this);
        }
        
        
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 31 * hash + (this.effect != null ? this.effect.hashCode() : 0);
        hash = 31 * hash + this.cost;
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
        final potionImpl other = (potionImpl) obj;
        return true;
    }
    
    
    
    
}
