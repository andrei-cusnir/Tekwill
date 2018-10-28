//1)Создайте класс в котором будет переменные minutes, meters.
//Вычислите скорость первой машины в киллометрах в час, если минуты = 30 и метры равны 49300.
package practiceHome01;

public class CalcSpeed {
    private static double minutes = 30;
    private static double meters = 49300;
    private static double speed ;
    public static void main (String[]args){ ;
        speed = ((meters*2)/1000)/((minutes*2)/60);
        System.out.println("Speed Km/Hour is: "+ speed);

    }
}
