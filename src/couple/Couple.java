//5. Создайте класс Man и Woman в одном пэкэдже и класс Couple в другом пэкэдже.
// Создайте class Main в другом пэкэдже. Пара должна состоять из мужчины и женщины.
// Парой являются лишь те, у кого одинаковая фамилия.
//Определите данную логику в классе Main в main методе.
// В случае, если у парня и девушки разная фамилия, присвоить девушке фамилию парня и создать пару.
// Пара не создается, пока условия не будут выполнены.
package couple;

import family.Man;
import family.Woman;

public class Couple {
    Man man;
    Woman woman;

    Couple(Man man, Woman woman) {
        this.man = man;
        this.woman = woman;
    }

    public Boolean isCouple() {
        if (man.getLastName().equals(woman.getLastName())) {
            return true;

        } else return false;
    }

    @Override
    public String toString() {
        return "" + man +
                "  and  " + woman;
    }

    public static void main(String[] args) {
        Woman woman1 = new Woman("Angelica", "Ivanova", 20);
        Woman woman2 = new Woman("Helga", "Titanium", 35);
        Woman woman3 = new Woman("Olga", "Jandarm", 18);

        Woman[] womansWorld = {woman1, woman2, woman3};

        Man man1 = new Man("Artem", "Ivanova", 20);
        Man man2 = new Man("Fedor", "Drankor", 35);
        Man man3 = new Man("Fedea", "Jandarm", 18);

        Man[] mansWorld = {man1, man2, man3};

        Couple[] couple = new Couple[mansWorld.length * womansWorld.length];

        int counter = 0;

        for (int j = 0; j < womansWorld.length; j++) {
            for (int i = 0; i < mansWorld.length; i++) {
                couple[counter] = new Couple(mansWorld[i], womansWorld[j]);
                counter++;
            }
        }

        for (int i = 0; i < couple.length; i++) {
            System.out.println(couple[i].toString() + " couple? " + couple[i].isCouple());
        }
    }

}
