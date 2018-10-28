package practice05;

public class Polipoli {
public static void main(String [] args){
    String a = "lalalal";
    boolean answer = true;
    for (int i=0; i<a.length()/2; i++){
        if (a.charAt(i) != a.charAt(a.length()-1-i)){
            System.out.println("it is not polindrom");
            answer = false;
            break;
        }
    }
    System.out.println(answer);
}
}
