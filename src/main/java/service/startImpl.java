/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import config.startPokemon;

/**
 *
 * @author Calen
 */
public class startImpl implements startPokemon 
{
    private String id;
    private String realName;
    private String nickname;
    private int level;
            
    public String starterPokemon(String realName, String nickname, int level)
    {
        return "Name: "+realName+" Nickname: "+nickname+" Level:"+level;
    }
    
    private startImpl()
    {
        
    }
    
    private startImpl(Builder build)
    {
        id=build.id;
        realName=build.realName;
        nickname=build.nickname;
        level=build.level;
    }
    
    public static class Builder
    {
        private String id;
        private String realName;
        private String nickname;
        private int level;
        
        public Builder()
        {
        }
        
        public Builder(String id)
        {
            this.id=id;
        }
        
        public Builder name(String value)
        {
            realName=value;
            return this;
        }
        
        public Builder nick(String value)
        {
            nickname=value;
            return this;
        }
        
        public Builder level (int value)
        {
            level=value;
            return this;
        }
        
        public startImpl build()
        {
            return new startImpl(this);
        }
    }

    public String getRealName() {
        return realName;
    }

    public String getNickname() {
        return nickname;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.realName != null ? this.realName.hashCode() : 0);
        hash = 37 * hash + (this.nickname != null ? this.nickname.hashCode() : 0);
        hash = 37 * hash + this.level;
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
        final startImpl other = (startImpl) obj;
        return true;
    }
    
    
    
    
    
}
