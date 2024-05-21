import java.util.Scanner;

public class p01473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        int[] d = new int[26];
        for (int i = 0; i < lS; i++) {
            d[S.charAt(i) - 'a']++;
        }
        int dd = 0;
        for (int i = 0; i < 26; i++) {
            if (d[i] % 2!= 0) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd!= 0) || (lS % 2 == 1 && dd!= 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i = 0; i < 26; i++) {
                if (d[i] > 0) {
                    dnm *= factorial(d[i] / 2);
                }
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}