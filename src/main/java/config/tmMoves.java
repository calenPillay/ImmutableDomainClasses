/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

/**
 * Certain pokemon can be taught battle techniques by capsules called TM's(Techinque Machines) that are sold at the pokemon center
 * These battle techniques can be forgotten or replaced by other battle techniques
 * @author Calen
 */
public interface tmMoves 
{
    public String tmProperties(String name, String description, double price);
    
}
