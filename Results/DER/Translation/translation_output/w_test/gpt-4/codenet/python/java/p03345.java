Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        if ((K & 1) == 0) { // even number
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
        
        scanner.close();
    }
}
```

When you run the Java program with the test input `1 2 3 1`, the expected output will be `1`.
