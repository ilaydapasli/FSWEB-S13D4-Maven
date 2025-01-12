package org.example;

public class Player {
    private final String name;
    private int healthPercentage;
    private Weapon weapon;


    public Player(String name,int healthPercentage,Weapon weapon){
        this.name=name;
        if (healthPercentage>100){
            this.healthPercentage=100;
        }else if(healthPercentage<0){
            this.healthPercentage=0;
        }else {
            this.healthPercentage=healthPercentage;
        }
    }
    public int healthRemaining(){
        return  healthPercentage;
    }
    public void loseHealth(int damage){
        this.healthPercentage-=damage;
        if (healthPercentage<0){
            System.out.println(name + " player has been knocked out of game");
        }

    }
    public void restoreHealth(int healthPotion ){
    this.healthPercentage += healthPotion;
    if (healthPercentage>100){
        this.healthPercentage=100;
    }
    }
}
