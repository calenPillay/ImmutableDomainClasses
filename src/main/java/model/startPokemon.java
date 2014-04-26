/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * The starter pokemon is the pokemon that a trainer is given when starting out on their journey as a trainer
 * These pokemon usually need specific methods to get healed as opposed to older and more experienced pokemon
 * @author Calen
 */
public interface startPokemon 
{
    public String starterPokemon(String realName, String nickName, int level);
    
}
