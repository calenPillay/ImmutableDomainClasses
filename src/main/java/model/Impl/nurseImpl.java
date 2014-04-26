/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Impl;

import model.nurseDetails;

/**
 *
 * @author Calen
 */
public class nurseImpl implements nurseDetails 
{
    private String id;
    private String name;
    private String surname;
    private double pay;
    public String nurseProperties(String name, String surname, double pay)
    {
        return "Name: "+name+" Surname: "+surname+" Salary: "+pay;                
    }
    
    private nurseImpl()
    {
        
    }
    
    private nurseImpl(Builder build)
    {
        id=build.id;
        name=build.name;
        surname=build.surname;
        pay=build.pay;
        
    }
    
    public static class Builder
    {
        private String id;
        private String name;
        private String surname;
        private double pay;
        
        public Builder()
        {
        }
        
        public Builder(String id)
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
        
        public Builder pay( double value)
        {
            pay=value;
            return this;
        }
        
        public nurseImpl build()
        {
            return new nurseImpl(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.surname != null ? this.surname.hashCode() : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.pay) ^ (Double.doubleToLongBits(this.pay) >>> 32));
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
        final nurseImpl other = (nurseImpl) obj;
        return true;
    }
    
    
}
