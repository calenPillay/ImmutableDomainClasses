/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.machineDetails;

/**
 *
 * @author Calen
 */
public class machineImpl implements machineDetails 
{
    
    private int id;
    private String location;
    private int yearsOfService;
    public String machineProperties(String location, int yearsOfService)
    {
        return "Location stored: "+location+" Years In Service: "+yearsOfService;
    }
    
    private machineImpl()
    {
    }
    
    private machineImpl(Builder build)
    {
         id=build.id;
         location=build.location;
         yearsOfService = build.yearsOfService;
    }
    
    public static class Builder
    {
        private int id;
        private String location;
        private int yearsOfService;
        
        public Builder()
        {
        }
        
        public Builder (int id)
        {
            this.id=id;
        }
        
        public Builder location (String value)
        {
            location=value;
            return this;
        }
        
        public Builder yearsOfService(int value)
        {
            yearsOfService=value;
            return this;
        }
        
        public machineImpl build()
        {
            return new machineImpl (this);
        }
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + (this.location != null ? this.location.hashCode() : 0);
        hash = 97 * hash + this.yearsOfService;
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
        final machineImpl other = (machineImpl) obj;
        return true;
    }
    
    
}
