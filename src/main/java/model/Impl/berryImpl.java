/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Impl;

import model.berry;

/**
 *
 * @author Calen
 */
public final class berryImpl implements berry 
{
    private String flavour;
    private String texture;
    private int size;
    private String id;
    public String berryProperties(String flavour, String texture, int size) 
    {
       return "Flavour: "+flavour +"Texture: "+texture+" Size: "+size;
    }
    
    private berryImpl()
    {
        
    }
    
    private berryImpl (Builder builder)
    {
        id = builder.id;
        flavour=builder.flavour;
        texture=builder.texture;
        size=builder.size;
    }
    
    public static class Builder
    {
        private String flavour;
        private String texture;
        private int size;
        private String id;
            
    
    
    public Builder (String id)
    {
        this.id=id;
    }
    
    public Builder flavour(String value)
    {
        flavour =value;
        return this;
    }
    
    public Builder texture (String value)
    {
        texture=value;
        return this;
    }
    
    public Builder size (int value)
    {
        size=value;
        return this;
    }
    
    public berryImpl build()
    {
        return new berryImpl(this);
    }
    
    }

    public String getFlavour() {
        return flavour;
    }

    public String getTexture() {
        return texture;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.flavour != null ? this.flavour.hashCode() : 0);
        hash = 61 * hash + (this.texture != null ? this.texture.hashCode() : 0);
        hash = 61 * hash + this.size;
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
        final berryImpl other = (berryImpl) obj;
        return true;
    }
    
    
    
    
    
    
    
    
    
}
