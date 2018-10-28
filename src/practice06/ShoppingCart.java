package practice06;

public class ShoppingCart {
    public static void main (String[] args){
        Item item1, item2;
        item1= new Item();
        item2= new Item();
        item1.desc = "Shirt";
        item2.desc = "Pants";
        System.out.println("Item1 is :" + item1.desc);
        System.out.println("Item2 is :" + item2.desc);
    }
}
