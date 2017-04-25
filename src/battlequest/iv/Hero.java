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
public class Hero {
   
   private int myAttack;
   private double myDefense;
   private int myLevel;
   private int myGold;
   private int myHp;
   
    public Hero(int attack, double defense, int gold, int level, int hp){
       myAttack = attack;
       myDefense = defense;
       myLevel = level;
       myGold = gold;
       myHp = hp;
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
     public void setGold(int gold){
        myGold = gold;
    }
   
    public int getGold(){
        return myGold;
    }
     public void setDefense(int defense){
        myDefense = defense;
    }
    
    public double getDefense(){
        return mydefense;
    }
     public void setLevel(int level){
        myLevel = level;
    }
    
    public int getLevel(){
        return myLevel;
    }
    
   public void attack(Enemy enemy){
       
   }
   
   public void usePotion(){
       
   }
   
   public int hCalcGoldDrop(){
       return 0;
   }
   
   public void levelUp(){
       
   }
   
}
