package family;

public class Man {
    private String name;
    private String lastName;
    private int age;
    public Man (){

    }
    public Man(String name, String lastName , int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    Man Man1 = new Man("Artem" , "Ivanova" , 20);
    Man Man2 = new Man("Fedor","Drankor",35);
    Man Man3 = new Man("Fedea","Jandarm",18);
}
