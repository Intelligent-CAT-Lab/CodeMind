```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        String all = "";
        String sub = "";
        int p = -1;

        int o = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                o = i;
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

    public static int gcd(int x, int y) {
        return (y != 0) ? gcd(y, x % y) : x;
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println((x / g) + "/" + (y / g));
    }
}
```
