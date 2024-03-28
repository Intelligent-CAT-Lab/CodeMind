Below is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        if ((K & 1) == 0) { // Even number
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```

For the provided test input "1 2 3 1", this Java code should output "-1" as the expected output. Please note that there might be a typo in the expected output you provided (-90). Based on the logic of the code (either `A - B` or `B - A`), the output should be `-1` if the given numbers are `1 2 3 1`.
