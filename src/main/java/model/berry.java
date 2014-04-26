/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Calen
 * In the world of pokemon, berries have certain healing properties. Different berries heal different status effects
 *
 */
public interface berry 
{
    public String berryProperties(String flavour, String texture, int size);
    
}
