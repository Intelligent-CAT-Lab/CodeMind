```java
import java.util.Scanner;

public class NumberSumEquals7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        scanner.close();

        int a = Character.getNumericValue(n.charAt(0));
        int b = Character.getNumericValue(n.charAt(1));
        int c = Character.getNumericValue(n.charAt(2));
        int d = Character.getNumericValue(n.charAt(3));

        if (a + b + c + d == 7) {
            System.out.print(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a + b + c - d == 7) {
            System.out.print(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a + b - c + d == 7) {
            System.out.print(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a + b - c - d == 7) {
            System.out.print(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a - b + c + d == 7) {
            System.out.print(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a - b + c - d == 7) {
            System.out.print(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if (a - b - c + d == 7) {
            System.out.print(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a - b - c - d == 7) {
            System.out.print(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
```
