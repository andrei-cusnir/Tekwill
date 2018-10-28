package practice05;

public class Practice04 {
    public static void main (String [] args){
        String custName = "Marry Smith";
        String itemDesc = "Shirt";
        String message;
        double price = 25.00;
        double tax = 5.78;
        int quantity = 5;
        double total;
        message = custName + " wants to buy "+ quantity+ " " + itemDesc+"s";
        System.out.println(message);
        total = price*tax*quantity;
        System.out.println("total cost with tax " + total + "$");
    }
}
