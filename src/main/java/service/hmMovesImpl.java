/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.hmMoves;

/**
 *
 * @author Calen
 */
public class hmMovesImpl implements hmMoves
{
    private int id;
    private String name;
    private String benefit;
    private double price;
    
    
    public String hmProperties(String name, String benefit, double price)
    {
        return "Name "+name+ " Benefit: "+benefit+" Price: "+price;
    }
    
    public hmMovesImpl()
    {}
    
    public hmMovesImpl(Builder build)
    {
        id=build.id;
        name=build.name;
        benefit=build.benefit;
        price=build.price;                
    }
    
    public static class Builder
    {
        private int id;
        private String name;
        private String benefit;
        private double price;
        
        public Builder()
        {}
        
        public Builder (int id)
        {
            this.id=id;
        }
        
        public Builder name(String value)
        {
            name=value;
            return this;
        }
        
        public Builder benefit(String value)
        {
            benefit=value;
            return this;
        }
        
        public Builder price(double value)
        {
            price=value;
            return this;
        }
        
        public hmMovesImpl build()
        {
            return new hmMovesImpl(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBenefit() {
        return benefit;
    }

    public double getPrice() {
        return price;
    }

  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 71 * hash + (this.benefit != null ? this.benefit.hashCode() : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final hmMovesImpl other = (hmMovesImpl) obj;
        return true;
    }
    
    
}
