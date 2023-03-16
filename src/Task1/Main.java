package Task1;

import java.util.ArrayList;

public class Main {
   public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        customers.add(new Customer("Jens","Hansen","jh123"));
        customers.add(new Customer("Kim","Jensen","kj123"));
        customers.add(new Customer("Egon","Olsen","eg123"));
        customers.add(new Customer("Ole","Faxe","of123"));
        customers.add(new Customer("Poul","Sigurd","ps123"));
        customers.add(new Customer("Benny","Henriksen","bh123"));

        printCustomers();


    }

    public static void printCustomers(){
        for (Customer c: customers) {
            System.out.println(c);
        }

    }
}