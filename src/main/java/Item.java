import java.util.ArrayList;
import java.util.Scanner;
public class Item {

    public static Scanner scanner = new Scanner(System.in);

        private String name;
        private int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public static void displayMenu(ArrayList<String> listToDisplay){
            for(String i : listToDisplay){
                System.out.println(i);
            }
        }

        public static int getNumericInput(){
            try {
                String i = scanner.nextLine();
                int j = Integer.parseInt(i);
                return j;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number");
                return getNumericInput();
            }
        }

    public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        public String toString() {
            return "Item " + name + "\tCurrent amount: " + amount + "\n";
        }

    }
