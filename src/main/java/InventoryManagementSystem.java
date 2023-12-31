import java.util.ArrayList;
import java.util.Scanner;
public class InventoryManagementSystem {

        public static void main(String[] args){

            System.out.println("Hello, what would you like to do?");
            manageItems();
        }

        private static void manageItems(){

            int milkAmount = 30;
            int butterAmount = 40;
            int breadAmount = 60;

            Scanner scanner = new Scanner(System.in);

            ArrayList<String> options = new ArrayList<String>();
            options.add("1) Increase items");
            options.add("2) Decrease items");
            options.add("3) Show items");

            Item.displayMenu(options);

            int userInput = Item.getNumericInput();
            if(userInput == 3 || userInput == 2 || userInput == 1) {
                if (userInput == 1) {
                    System.out.println("Which items would you like to increase?");
                    ArrayList<Item> inventory = new ArrayList<Item>();
                    Item milk = new Item("1) Milk", milkAmount);
                    Item butter = new Item("2) Butter", butterAmount);
                    Item bread = new Item("3) Bread", breadAmount);
                    System.out.println(milk.toString() + butter.toString() + bread.toString());

                    int userInputInc = Item.getNumericInput();

                    if(userInput == 1) {
                        System.out.println("How much would you like" + milk.getName() + "to increase?");
                    } else {
                        System.out.println("N/A");
                    }


                }

                if (userInput == 2) {
                    System.out.println("Which items would you like to decrease?");
                    ArrayList<Item> inventory = new ArrayList<Item>();
                    Item milk = new Item("1) Milk", milkAmount);
                    Item butter = new Item("2) Butter", butterAmount);
                    Item bread = new Item("3) Bread", breadAmount);
                    System.out.println(milk.toString() + butter.toString() + bread.toString());
                }
                if (userInput == 3) {
                    System.out.println("Showing items?");
                    ArrayList<Item> inventory = new ArrayList<Item>();
                    Item milk = new Item("1) Milk", milkAmount);
                    Item butter = new Item("2) Butter", butterAmount);
                    Item bread = new Item("3) Bread", breadAmount);
                    System.out.println(milk.toString() + butter.toString() + bread.toString());

                    System.out.println("Enter x to return to menu");
                    String k = scanner.nextLine();
                    if (k.charAt(0) == 'x') {
                        manageItems();
                    } else {
                        System.out.println("Invalid option");
                    }
                }
            }
                else{
                    System.out.println("Invalid option.");
                    manageItems();
                }
            }
        }
