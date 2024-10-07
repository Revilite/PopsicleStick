package com.pluralsight.popsicleStick;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class PopsicleStick {
    public static ArrayList<String> names = new ArrayList();
    public static  Random rand = new Random();
    public static String nameArray[] = {"Jacob", "Adiran", "Alan", "Anthony", "Ayanna", "Brittany", "Caleb", "Damian", "Deiber", "Jermaine", "Jontez", "Jovaughn", "Keante", "Keely", "Miriam", "Nicholas", "Quyen", "Siry", "Tequila"};
    public static int randomizer = rand.nextInt(18);
    public static void printName() {




        System.out.printf("""
                The Magic name is.....
                
                |------------------|
                |                  |
                      %s          
                |                  |
                |------------------|
                
                
                Would you like to reroll?
                
                (y/n)
                """, names.get(randomizer));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String loop = "y";
        for(String name: nameArray){
            names.add(name);
        }


        while (loop.equals("y")) {
            printName();
            loop = scan.nextLine().toLowerCase();
            do {
                if (loop.equals("n")) {
                    return;
                } else if (loop.equals("y")) {
                   names.remove(randomizer);
                   if(names.size() > 0) {
                       randomizer = rand.nextInt(names.size());
                   }
                   else{
                       System.out.println("Your out of names!");
                       return;
                   }
                    break;
                } else {
                    System.out.println("Incorrect answer please enter \'y\' or \'n\'");
                    loop = scan.nextLine();
                }
            } while (loop != "y");

        }
    }
}
