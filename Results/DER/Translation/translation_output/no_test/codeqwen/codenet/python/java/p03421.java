Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        if (n < a + (b-1) || n > a + (b-1) * a) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println("");
            return;
        }

        int loop = n / (b-1);
        int option = n % (b-1);

        for (int j = 0; j < b-1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop+1; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option -= 1;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }
        System.out.println("");
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, checks if they satisfy the conditions, and then prints the output accordingly.
