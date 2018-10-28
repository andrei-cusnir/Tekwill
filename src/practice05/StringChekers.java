package practice05;

public class StringChekers {

    public boolean isPolindrom(String polindrom) {
        for (int i = 0; i < polindrom.length() / 2; i++) {
            if (polindrom.charAt(i) != polindrom.charAt(polindrom.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringChekers stringChekers = new StringChekers();
        System.out.println(stringChekers.isPolindrom("sdhaiuwhdi"));
    }
}