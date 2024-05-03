Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        int n = w.length();
        int t = -1;

        int[] z = Z(w);

        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && w.substring(0, n - j).equals(w.substring(j))) {
                t = j;
                break;
            }
        }

        if (t == -1) {
            System.out.println("1\n1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            int[] zl = Z(w);
            StringBuilder wReverse = new StringBuilder(w);
            wReverse.reverse();
            int[] zr = Z(wReverse.toString());
            int cnt = 0;

            for (int i = 0; i < n - 1; i++) {
                if (zl[i] && zr[n - 2 - i]) {
                    cnt++;
                }
            }

            System.out.println(2);
            System.out.println(cnt);
        }
    }

    public static int[] Z(String s) {
        int m = s.length();
        int[] z = new int[m];
        int c = 0;
        int f[] = new int[m];

        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < m && s.charAt(j) == s.
