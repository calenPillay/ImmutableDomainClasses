/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Trainers are allowed to leave certain pokemon behind to be trained by the daycare at the pokemon center for a price
 * @author Calen
 */
public interface daycare 
{
    public String daycarePkmn(String name, int age, int level, double price);
}
