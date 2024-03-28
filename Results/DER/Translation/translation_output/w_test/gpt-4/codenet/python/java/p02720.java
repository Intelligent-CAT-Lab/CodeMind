Below is the Java translation of your provided Python code, wrapped in the Java syntax:

```java
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Queue<Integer> que = new ArrayDeque<>();
        for (int i = 1; i <= 9; i++) {
            que.add(i);
        }
        int a = 0;
        for (int i = 0; i < K; i++) {
            a = que.poll();
            if (a % 10 != 0) {
                que.add(a * 10 + a % 10 - 1);
            }
            que.add(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(a);
        scanner.close();
    }
}
```

You can use the above code to achieve similar functionality as the Python code in Java. The `Queue` is used to simulate the `deque` from Python, and the same logic is applied for generating and printing the value corresponding to the given `K`.

The provided test case would be run with this Java program as follows:

Test input:
```
15
```

Expected output:
```
23
```
