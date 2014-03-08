/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.daycareStaff;

/**
 *
 * @author Calen
 */
public class daycareStaffImpl implements daycareStaff
{
    
    private int id;
    private String name;
    private String speciality;
    private double salary;
    
      public String staffDetails (String name, String speciality, double salary)
      {
          return "Name: "+name+" Speciality: "+speciality+" Salary: "+salary;
      }
      
   private daycareStaffImpl()
   {
   }
   
   private daycareStaffImpl(Builder build)
   {
       id=build.id;
       name=build.name;
       speciality=build.speciality;
       salary=build.salary;
   }
   
     public static class Builder
    {
        private int id;
        private String name;
        private String speciality;
        private double salary;
        
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
        
        public Builder speciality(String value)
        {
            speciality=value;
            return this;
        }
        
        public Builder salary(double value)
        {
            salary=value;
            return this;
        }
        
        public daycareStaffImpl build()
        {
            return new daycareStaffImpl (this);
        }
    }
   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 83 * hash + (this.speciality != null ? this.speciality.hashCode() : 0);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
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
        final daycareStaffImpl other = (daycareStaffImpl) obj;
        return true;
    }
      
}
