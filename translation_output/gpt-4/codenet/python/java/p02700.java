Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
        
        scanner.close();
    }
}
```

Make sure to run this code within a class, as Java code execution starts from the `main` method, typically within a class. As in Python, the looping and condition checking is translated directly; however, input handling and print statements in Java are a bit more verbose requiring explicit calls to `Scanner` and `System.out`.
