/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Impl;

import model.finalEvolution;

/**
 *
 * @author Calen
 */
public class finalEvoImpl implements finalEvolution 
{
    private int id;
    private String name;
    private String nature;
    private int level;
    
    public String finalForm(String name, String nature, int level)
    {
        return "Name: "+name+ " Nature: "+ " Level: "+level;
    }
    
    private finalEvoImpl()
    {
    }
    
    private finalEvoImpl (Builder build)
    {
        id=build.id;
        name=build.name;
        nature=build.nature;
        level=build.level;
    }
    
    public static class Builder
    {
        private int id;
        private String name;
        private String nature;
        private int level;
        
        public Builder()
        {
        }
        
        public Builder (int id)
        {
            this.id=id;
        }
        
        public Builder name(String value)
        {
            name=value;
            return this;
        }
        
        public Builder nature(String value)
        {
            nature=value;
            return this;
        }
        
        public Builder level(int value)
        {
            level=value;
            return this;
        }
        
        public finalEvoImpl build()
        {
            return new finalEvoImpl (this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNature() {
        return nature;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 47 * hash + (this.nature != null ? this.nature.hashCode() : 0);
        hash = 47 * hash + this.level;
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
        final finalEvoImpl other = (finalEvoImpl) obj;
        return true;
    }
    
    
    
}
