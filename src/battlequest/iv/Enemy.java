/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlequest.iv;

/**
 *
 * @author Drew
 */
public class Enemy {
    
    private int myAttack;
    private double myDefense;
    private int myHp;
    private int myLevel;
    
    public Enemy(int attack, double defense, int hp, int level){
        myAttack = attack;
        myDefense = defense;
        myHp = hp;
        myLevel = level;
    }
    
    public void setAttack(int attack){
        myAttack = attack;
    }
    
    public int getAttack(){
        return myAttack;
    }
     public void setHp(int hp){
        myHp = hp;
    }
    
    public int getHp(){
        return myHp;
    }
     public void setDefense(int defense){
        myDefense = defense;
    }
    
    public int getDefense(){
        return mydefense;
    }
     public void setLevel(int level){
        myLevel = level;
    }
    
    public int getLevel(){
        return myLevel;
    }
    
   public void attack(Hero hero){
       
   }
   public int calcGoldDropped(){
       return 0;
   }
}
