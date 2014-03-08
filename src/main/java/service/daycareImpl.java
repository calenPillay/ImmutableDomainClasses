/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.daycare;

/**
 *
 * @author Calen
 */
public class daycareImpl implements daycare
{
    private int id;
    private String name;
    private int age;
    private int level;
    private double price;

    public String daycarePkmn(String name, int age, int level, double price)
    {
        return "Name: "+name +" Age: "+age+ " Level: "+level+ " Price: "+price; 
    }
    
    private daycareImpl(){};
    
    public daycareImpl(Builder build)
    {
        id=build.id;
        name=build.name;
        age=build.age;
        level=build.level;
        price=build.price;
    }
    
      public static class Builder
    {
        private int id;
        private String name;
        private int age;
        private int level;
        private double price;
        
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
        
        public Builder age(int value)
        {
            age=value;
            return this;
        }
        
        public Builder level(int value)
        {
            level=value;
            return this;
        }
        
        public Builder price(double value)
        {
            price=value;
            return this;
                    
        }
        
        public daycareImpl build()
        {
            return new daycareImpl (this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLevel() {
        return level;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + this.age;
        hash = 79 * hash + this.level;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final daycareImpl other = (daycareImpl) obj;
        return true;
    }
    
    
}
