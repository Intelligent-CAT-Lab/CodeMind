Here's the translated Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        
        if ((K & 1) == 0) { // 偶数 (even number)
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
        
        scanner.close();
    }
}
```

I kept the original Python comment (which appears to be written in Chinese and refers to an even number) next to the corresponding Java code. The Java code uses a `Scanner` for input, and has a single `main` method, which is the entry point of the program. Java requires the use of classes, and therefore the entire code is wrapped in a class called `Main`.
