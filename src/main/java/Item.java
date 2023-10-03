public class Item {

        private String name;
        private int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        public String toString() {
            return "Item " + name + "\tInventory current amount: " + amount + "\n";
        }
    }
