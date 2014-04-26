/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Once a pokemone reaches a certain level, it "evolves" into a different, stronger pokermon. These stronger pokemon
 * require different treatments as opposed to starter/final form pokemon
 * @author Calen
 */
public interface secondEvolution 
{
    public String secondStage (String name, String skill, int level);
}
