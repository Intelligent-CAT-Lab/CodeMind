```java
import java.util.Scanner;

public class Main {

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x/g + "/" + y/g);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        String all = "";
        String sub = "";
        int p = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        int l = p - o - 1;
        if (p == -1) {
            printV(Integer.parseInt(all), (int) Math.pow(10, d));
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) (Math.pow(10, d) - Math.pow(10, l)));
        }
    }
}
```
