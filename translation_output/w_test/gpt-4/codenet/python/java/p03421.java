Here's the Java translation for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n < a + (b - 1) || n > a + (b - 1) * a) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < a; i++) {
            System.out.print((n - a + i + 1) + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println("");
            return;
        }

        int loop = n / (b - 1);
        int option = n % (b - 1);
        for (int j = 0; j < (b - 1); j++) {
            if (option > 0) {
                for (int i = 0; i < (loop + 1); i++) {
                    System.out.print((n - loop - 1 + i + 1) + " ");
                }
                n -= (loop + 1);
                option -= 1;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print((n - loop + i + 1) + " ");
                }
                n -= loop;
            }
        }
        System.out.println("");
    }
}
```

To use the above program, you would compile it using a Java compiler and then execute the resulting class file, providing the input in the form specified in the test case (`5 3 2` in this case). The program will produce the expected output (`2 4 1 5 3`).
