/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

/**
 *Just like berries, potions also heal different status effects but have different properties.
 * @author Calen
 */
public interface potions 
{
    public String potionProperties (String name, String effect, int cost);
            
}
