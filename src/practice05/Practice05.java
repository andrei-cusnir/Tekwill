package practice05;

public class Practice05 {
    public static void main (String [] args) {
        String custName = "Marry Smith";
        String itemDesc = "Shirt";
        String message;
        double price = 25.00;
        double tax = 5.78;
        int quantity = 0;
        double total;
        message =  custName+ " wants to buy " + quantity + " " + itemDesc;
        total = price*tax* quantity;

        if (quantity>1) {
            message = message + "s";
            System.out.println(message);
            System.out.println(total);


            }
            if (quantity ==1) {
                System.out.println(message);
                System.out.println(total);
            }
            if (quantity<1) {
                System.out.println(itemDesc + " is out of stock");
            }
        }
    }
