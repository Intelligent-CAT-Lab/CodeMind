Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0;
        int P = 0;
        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then it calculates the product of 111 and each integer from 0 to 9. If the product is less than or equal to the user's input and the product is greater than the previous product, it prints the product. The previous product is updated with the current product after each iteration.
