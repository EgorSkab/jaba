package bsu.rfe.java.group5.lab_1.Skabitski.var12B;

import bsu.rfe.java.group5.lab_1.Skabitski.var12B.Cheese;
import bsu.rfe.java.group5.lab_1.Skabitski.var12B.Food;
import bsu.rfe.java.group5.lab_1.Skabitski.var12B.Beef;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static int equalsFood(Food obj1, Food[] breakfast){
        int count = 0;
        for(Food item : breakfast){
            if (item == null)
                break;
            else if (item.equals(obj1))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        boolean sortFlag = false, caloriesFlag = false;
        int items = 0;
        for (String arg : args) {
            if (arg.equals("-sort")) {
                sortFlag = true;
                continue;
            }
            if (arg.equals("-calories")) {
                caloriesFlag = true;
                continue;
            }
            else{
                String[] parts = arg.split("/");
                if ("Cheese".equalsIgnoreCase(parts[0])) {
                    breakfast[items] = new Cheese();
                    items++;
                    //System.out.println("Добавлен сыр");
                    continue;
                }
                //if (true) { System.out.println("nigger nigger nigger nigger nigger nigger nigger nigger nigger");}
                if ("Beef".equalsIgnoreCase(parts[0])) {
                    breakfast[items] = new Beef(parts[1]);
                    items++;
                    //System.out.println("Добавлено мясо");
                    continue;
                }
            }
        }
        for (Food item : breakfast) {
            if (item == null)
                break;
            else
                item.print_name();
        }

        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;

        if (sortFlag) {
            Arrays.sort(breakfast, new FoodComparator());
        }

        System.out.println(breakfast[0].name + " " + breakfast[0].getType() + " in quantity " + equalsFood(breakfast[0], breakfast));
        if (caloriesFlag) {
            int sum = 0;
            for (Food item : breakfast) {
                if (item != null) {
                    sum += item.calculateCalories();
                } else
                    break;
            }
            System.out.println("Calories in breakfast = " + sum);
        }
        //System.out.println("Удачи");


        for (Food item : breakfast) {
            if (item == null)
                break;
            else
                item.print_name();
        }
    }

}