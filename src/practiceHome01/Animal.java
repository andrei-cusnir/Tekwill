//2. Создайте файл в котором будут 2 класса Animal, Animal2.
//Создайте 3 поля характеризующие любое животное в первом класса.
//Cоздайте в энимал2 мэйн метод и в нем объект класса Энимал.
//Определите значение переменных через методы.
//Выведите все значения, также беря значение с помощью методов. Используйте модификаторы доступа.
    package practiceHome01;

    public class Animal {
    private int legs;
    private int eyes;
    private String name;

    public Animal(){
        this.eyes = 2;
        this.legs = 4;
        this.name = "Clicka";
        }
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class  Animal2 {


        public static void main (String[] args){
            Animal dog = new Animal();
            Animal cat = new Animal();

            cat.setEyes(2);
            cat.setLegs(4);
            cat.setName("Murzik");
            System.out.print(cat.getEyes() + " " + cat.getLegs()+ " " + cat.getName());
            System.out.println();
            System.out.println(dog.getEyes()+" "+dog.getName());

        }
    }
}
