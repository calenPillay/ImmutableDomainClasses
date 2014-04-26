/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Impl;

import model.tmMoves;

/**
 *
 * @author Calen
 */
public class tmMovesImpl implements tmMoves 
{
    private int id;
    private String name;
    private String description;
    private double price;
    
    

    public String tmProperties (String name, String description, double price)
    {
        return "Name: "+name+ " Description"+description+ " Price: "+price;
    }
    
    private tmMovesImpl()
    {
    }
    
    private tmMovesImpl(Builder build)
    {
        id=build.id;
        name=build.name;
        description=build.description;
        price=build.price;
    }
    
    public static class Builder
    {
        private int id;
        private String name;
        private String description;
        private double price;
        
        public Builder()
        {
            
        }
        
        public Builder(int id)
        {
            this.id=id;
        }
        
        public Builder name(String value)
        {
            name=value;
            return this;
        }
        
        public Builder description(String value)
        {
            description=value;
            return this;
        }
        
        public Builder price(double value)
        {
            price=value;
            return this;
        }
        
        public tmMovesImpl build()
        {
            return new tmMovesImpl(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.description != null ? this.description.hashCode() : 0);
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
        final tmMovesImpl other = (tmMovesImpl) obj;
        return true;
    }
    
    
    
}
