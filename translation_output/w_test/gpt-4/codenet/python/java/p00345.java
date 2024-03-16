Below is the translated Java code for the given Python script that reads a repeating decimal and outputs the fraction form:

```java
import java.util.Scanner;

public class RepeatingDecimalToFraction {

    public static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println((x / g) + "/" + (y / g));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        String all = "";
        String sub = "";
        int p = -1;
        int o = 0; // to store the index of '.'

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
        int l = (p != -1) ? (p - o - 1) : 0;
        if (p == -1) {
            printV(Integer.parseInt(all), (int)Math.pow(10, d));
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int)Math.pow(10, d) - (int)Math.pow(10, l));
        }
    }
}
```

This Java program performs the same function as the Python script. It takes an input of a repeating decimal, finds the repeating and non-repeating parts, calculates the appropriate numerator and denominator, and then prints out the fraction in simplified form.

To run the program, simply compile it with `javac RepeatingDecimalToFraction.java` and then run it with `java RepeatingDecimalToFraction`, then input the repeating decimal when prompted.
