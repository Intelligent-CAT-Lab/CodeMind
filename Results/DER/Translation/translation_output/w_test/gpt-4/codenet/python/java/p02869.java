Here is the Python code translated into Java. I have added a `Scanner` for input and have incorporated methods that match the functionalities of `math.floor` and `math.ceil` in Python:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if ((2*N)*(K + K + 2*N - 1) > N*(K + 2*N + K + 3*N - 1)) {
            System.out.println(-1);
            System.exit(0);
        }
        int[] flag = new int[2*N];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = 1;
        }
        for (int i = (int)Math.floor(N/2.0); i < N; i++) {
            int a = K + i;
            int b = K + 2*N - 1 - ((i - (int)Math.floor(N/2.0)))*2;
            int c = K + 3*N - 1 - (i - (int)Math.floor(N/2.0));
            System.out.println(a + " " + b + " " + c);
        }
        for (int i = 0; i < (int)Math.floor(N/2.0); i++) {
            int a = K + i;
            int b = K + 2*N - 2 - i*2;
            int c = K + 3*N - 1 - i - (int)Math.ceil(N/2.0);
            System.out.println(a + " " + b + " " + c);
        }
        scanner.close();
    }
}
```

With this Java code, if you input `1 1`, the expected output `1 2 3` will be printed to the console. Make sure you have `Scanner` imported and you are using the `java.util.Scanner` package for input handling.
