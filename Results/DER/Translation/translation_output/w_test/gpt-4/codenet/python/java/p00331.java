Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input from the user
        int H = scanner.nextInt();
        int R = scanner.nextInt();

        // Decision structure equivalent to Python code
        if (H >= 0) {
            System.out.println(1);
        }
        else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}
```

When provided with the test input `-3 3`, the Java program will yield the expected output `0`.
