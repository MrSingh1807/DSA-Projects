package javaLanguage;

public class modularExponention {
    public static void main(String[] args) {

        System.out.println(modularExponentiation(4, 3, 10));
    }

    public static int modularExponentiation(int x, int n, int m) {
        long result = 1;
        int reminder = 0;

        for (int i = 0; i < n; i++) {
            result *= x;

            if (result > m) {
                reminder += (int) (result % m);
                result = 1;
            }

            if (reminder > m)
                reminder %= m;
        }

        if (result > 1) {
            reminder += (int) result;
            reminder %= m;
        }

        return reminder;
    }

}
