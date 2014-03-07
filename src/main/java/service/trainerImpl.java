/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.trainerDetails;

/**
 *
 * @author Calen
 */
public final class trainerImpl implements trainerDetails 
{
    private String id;
    private String name;
    private String surname;
    private int age;
    
    public String trainerProperties(String name, String surname, int age)
    {
        return "Trainer name: "+name + " Surname: "+surname + " Age: "+age;
    }
    
    private trainerImpl()
    {
    }
    
    private trainerImpl(Builder build)
    {
        id=build.id;
        name=build.name;
        surname=build.surname;
        age=build.age;
    }
    
    public static class Builder
    {
        private String name;
        private String surname;
        private int age;
        private String id;
        
        public Builder()
        {
        }
        
        public Builder (String id)
        {
            this.id=id;
        }
        
        public Builder name(String value)
        {
            name=value;
            return this;
        }
        
        public Builder surname(String value)
        {
            surname=value;
            return this;
        }
        
        public Builder age(int value)
        {
            age=value;
            return this;
        }
        
        public trainerImpl build()
        {
            return new trainerImpl(this);
        }
        
        
        
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    
    
    
}
