Here's the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
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
        
        for (int j = 0; j < b - 1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop + 1; i++) {
                    System.out.print((n - loop - 1 + i + 1) + " ");
                }
                n -= loop + 1;
                option--;
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

This Java program takes the input `n`, `a`, and `b` similar to the Python code, processes it, and prints the output accordingly. Note that in Java, we use `System.out.print` and `System.out.println` to print outputs to the console, and we use `Scanner` to take input from the user.
