package bsu.rfe.java.group5.lab_1.Skabitski.var12B;

public class Cheese extends bsu.rfe.java.group5.lab_1.Skabitski.var12B.Food {

    public Cheese(){
        super("Cheese");
    }
    public void print_name(){
        System.out.println(this.name);
    }
    public void consume(){
        System.out.println(this.name + " consumed");
    }
    @Override
    public int calculateCalories(){
        return 150;
    }
}
