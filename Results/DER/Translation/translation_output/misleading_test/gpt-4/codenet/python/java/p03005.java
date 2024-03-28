Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
        scanner.close();
    }
}
```

You can compile and run this Java code to get the same functionality as the provided Python script. When you input `3 2`, the expected output will be `31`.
