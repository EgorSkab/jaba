package bsu.rfe.java.group5.lab_1.Skabitski.var12B;

import bsu.rfe.java.group5.lab_1.Skabitski.var12B.Consumable;
import bsu.rfe.java.group5.lab_1.Skabitski.var12B.Nutritious;

public abstract class Food implements Consumable, Nutritious {
    String name=null;
    public Food(String name){
        this.name = name;
    }
    public abstract void print_name();
    public boolean equals(Object arg0){
        if(!(arg0 instanceof Food)) return false;
        if(name==null ||(( Food)arg0).name ==null) return false;
        return name.equals(((Food)arg0).name);
    }
    public String toString(){
        return name;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return null;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract int calculateCalories();
}
