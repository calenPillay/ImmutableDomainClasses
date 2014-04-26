/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Impl;

import model.secondEvolution;

/**
 *
 * @author Calen
 */
public class secondEvoImpl implements secondEvolution 
{
    private int id;
    private String name;
    private String skill;
    private int level;
    
    public String secondStage (String name, String skill, int level)
    {
        return "Name: "+name+" Skill: " +skill + " Level: "+level;
    }
    
    private secondEvoImpl()
    {
        
    }
    
    private secondEvoImpl(Builder build)
    {
        id=build.id;
        name=build.name;
        skill=build.skill;
        level = build.level;
    }
    
    public static class Builder
    {
        private int id;
        private String name;
        private String skill;
        private int level;
        
    
    
    public Builder ()
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
    
    public Builder skill(String value)
    {
        skill=value;
        return this;
    }
    
    public Builder level (int value)
    {
        level=value;
        return this;
    }
    
    public secondEvoImpl build()
    {
        return new secondEvoImpl (this);
    }
    
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + (this.skill != null ? this.skill.hashCode() : 0);
        hash = 53 * hash + this.level;
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
        final secondEvoImpl other = (secondEvoImpl) obj;
        return true;
    }

   
    
    
}
