Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class RepeatingDecimalConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        String all = "";
        String sub = "";
        int o = -1;
        int p = -1;

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
            printV(Integer.parseInt(all) - Integer.parseInt(sub), (int) Math.pow(10, d) - (int) Math.pow(10, l));
        }
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    private static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println("^a" + (x / g));
    }
}
```

This Java program will perform the same functionality as the provided Python code. It reads a repeating decimal from the standard input, processes it, and prints the output in the specified format. 

Be aware that this code assumes that the input string is always a valid repeating decimal and it doesn't handle any potential exceptions that might occur with incorrect input formats. Additionally, the specific '^a' representation shown in the expected output seems to be unique and not standard notation for fractions or repeating decimals, so the function `printV` is tailored to print output in this specific way.
