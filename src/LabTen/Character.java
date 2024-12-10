package LabTen;

abstract class Character {
    public static final int MAX_Health = 100;
    protected String name;
    protected int Health;
    public Character(String name, int Health){
        this.name = name;
        this.Health = Math.min(Health, MAX_Health);
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return Health;
    }
    public void setHealth(int Health){
        this.Health = Math.max(0, Math.min(Health,MAX_Health));
    }
    public boolean isAlive(){
        if (Health>0){
            return true;
        }
        return false;
    }
    //abstract void attackChar(){

    }

