package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData(){
        File file = new File("coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                coffeeMenu.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file was not found.");
        }
    }
    public void displayCoffeeMenu() {
        for (String s : coffeeMenu) {
            System.out.println(s);
        }
    }


}

