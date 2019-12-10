package bsu.rfe.java.group7.lab1.Fyodorov.varA2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int countItems = 0;

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Pie")) {
                if (parts.length == 3){
                    breakfast[countItems] = new Pie(parts[1], parts[2]);
                }
                else{
                    breakfast[countItems] = new Pie(parts[1], null);
                }

            } else {
                System.out.println("Cannot find class " + parts[0] + ".\nContinue...\n");
                countItems--;
            }
            countItems++;
        }


        int counter = 0;
        Pie check = new Pie("berry", "super");
        for (Food item : breakfast) {

            if (item != null) {
                if (item.equals(check)) {
                    counter++;
                }
            }
        }
        System.out.println("Amount products of type " + "'" + check + "'" + ": " + counter);

        counter = 0;
        for (Food item : breakfast) {

            if (item != null) {
                if (item.equals_type(check)) {
                    counter++;
                }
            }
        }
        System.out.println("Amount products of type Pie"  + ": " + counter);
    }
}

