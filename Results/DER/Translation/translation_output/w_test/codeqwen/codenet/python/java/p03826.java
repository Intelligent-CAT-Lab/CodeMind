Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int s = a * b;
        int t = c * d;
        
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```

This Java program does the same thing as your Python code. It reads four integers from the user, calculates the product of the first two and the last two, and then prints the larger of the two products.
