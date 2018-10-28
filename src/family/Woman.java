package family;

public class Woman {
    private String name;
    private String lastName;
    private int age;
    public Woman (){

    }
    public Woman(String name, String lastName , int age){
     this.name = name;
     this.lastName = lastName;
     this.age = age;
    }
    Woman woman1 = new Woman("Angelica" , "Ivanova" , 20);
    Woman woman2 = new Woman("Helga","Titanium",35);
    Woman woman3 = new Woman("Olga","Jandarm",18);
}
