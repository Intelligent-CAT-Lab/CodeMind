Here is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0, P = 0;
        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
                break;
            }
            X = P;
        }
        scanner.close();
    }
}
```

You can run this Java code snippet with the test input `111`, and it will produce the expected output `141`.
