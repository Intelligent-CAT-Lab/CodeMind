Here is the equivalent Java code for the given Python program:

```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LunlunNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Long> que = new ArrayDeque<>();

        for (int i = 1; i <= 9; i++) {
            que.addLast((long) i);
        }

        long a = 0;
        for (int i = 0; i < K; i++) {
            a = que.pollFirst();
            if (a % 10 != 0) {
                que.addLast(a * 10 + (a % 10) - 1);
            }
            que.addLast(a * 10 + (a % 10));
            if (a % 10 != 9) {
                que.addLast(a * 10 + (a % 10) + 1);
            }
        }

        System.out.println(a);
        scanner.close();
    }
}
```

Make sure when you run this Java program, you have the Java Runtime Environment installed and use `java LunlunNumber` to execute the code after compilation with `javac LunlunNumber.java`. It expects an integer input just like the provided Python code.
