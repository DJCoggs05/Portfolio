package weekThree;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class restaurantSelector {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String vegetarian , vegan, glutenF;

        System.out.println("Is there anyone in your party that is vegetarian? Type Yes or No ");
        vegetarian = scn.nextLine();
        System.out.println("Is there anyone in your party that is vegan? Type Yes or No ");
        vegan = scn.nextLine();
        System.out.println("Is there anyone in your party that is gluten free? Type Yes or No ");
        glutenF = scn.nextLine();

        ArrayList<String> restaurants = new ArrayList<String>();
        restaurants.add("Hello");
        restaurants.add("Hello2");
        restaurants.add("Hello3");
        restaurants.get(0);

        if (vegetarian.equals( "No") && vegan.equals( "No")  && glutenF.equals( "No") ) {
            restaurants.add("Joe's Gourmet Burgers");
        }

        else if (vegetarian.equals( "Yes") && vegan.equals( "No")  && glutenF.equals( "Yes") ) {
            restaurants.add("Main Street Pizza Company");
        }

        else if (vegetarian.equals( "Yes") && vegan.equals( "Yes")  && glutenF.equals( "Yes") ) {
            restaurants.add("Corner Cafe");
        }

        else if (vegetarian.equals( "Yes")  && vegan.equals( "No")  && glutenF.equals( "No") ) {
            restaurants.add("Mama's Fine Italian");
        }

        else if (vegetarian.equals( "Yes")  && vegan.equals( "Yes") && glutenF.equals( "Yes") ) {
            restaurants.add("The Chef's Kitchen");
        }
        for(int x = 0; x< restaurants.size(); x++){
            System.out.println(restaurants.get(x));
        }
        //System.out.println(restaurants);


    }
}
