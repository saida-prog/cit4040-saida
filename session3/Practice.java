public class Practice {

    static void fixTheTypes() {
        double price = 8990.50;
        boolean available = true;
        double discount = 15 / 100.0;
        System.out.println("Practice 01: " + price + " " + available + " " + discount);
    }

    static String branch(int qty) {
        if (qty <= 0) {
            return "invalid";
        } else if (qty < 10) {
            return "standard price";
        } else if (qty < 100) {
            return "bulk discount";
        } else {
            return "wholesale";
        }
    }

    static int traceLoop() {
        int total = 100;
        int week = 0;
        while (total > 10) {
            total = total / 2;
            week = week + 1;
        }
        return week;
    }

    static int withDelivery(int price) {
        if (price > 5000) {
            return price;
        }
        return price + 900;
    }

    static int lengthOf(String text) {
        return text.length();
    }

    public static void main(String[] args) {
        fixTheTypes();

        int[] quantities = {5, 0, 10, 100};
        for (int qty : quantities) {
            System.out.println("Practice 02: qty = " + qty + " -> " + branch(qty));
        }

        System.out.println("Practice 03: " + traceLoop());

        System.out.println("Practice 04: " + withDelivery(6000));
        System.out.println("Practice 04: " + withDelivery(3000));

        try {
            lengthOf(null);
        } catch (NullPointerException e) {
            System.out.println("Practice 05: " + e.getMessage());
        }
    }
}
