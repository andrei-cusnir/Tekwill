package coupleManWoman;


import family.Man;
import family.Woman;

public class CoupleManWoman {

    public static void main(String[] args) {

        Woman woman1 = new Woman("Angelica", "Ivanova", 20);
        Woman woman2 = new Woman("Helga", "Titanium", 35);
        Woman woman3 = new Woman("Olga", "Jandarm", 18);

        Woman[] womansWorld = {woman1, woman2, woman3};

        Man man1 = new Man("Artem", "Ivanova", 20);
        Man man2 = new Man("Fedor", "Drankor", 35);
        Man man3 = new Man("Fedea", "Jandarm", 18);

        Man[] mansWorld = {man1, man2, man3};

        for (int i = 0; i < mansWorld.length; i++) {
            for (int j = 0; j < womansWorld.length; j++) {
                if (mansWorld[i].getLastName().equals(womansWorld[j].getLastName())) {
                    System.out.println(mansWorld[i].getName() + " " + mansWorld[i].getLastName() + " and "
                            + womansWorld[j].getName() + " " + womansWorld[j].getLastName() + " Is couple");
                }
            }
        }
    }
}
