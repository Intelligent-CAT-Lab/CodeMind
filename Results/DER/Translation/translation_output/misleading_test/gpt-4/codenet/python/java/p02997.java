Here's the translated code from Python to Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K > ((N - 1) * (N - 2)) / 2) {
            System.out.println(-1);
            return;
        }

        System.out.println(N - 1 + ((N - 1) * (N - 2)) / 2 - K);

        for (int i = 2; i <= N; i++) {
            System.out.println(1 + " " + i);
        }

        int a = 0;
        for (int i = 2; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (a < ((N - 1) * (N - 2)) / 2 - K) {
                    System.out.println(i + " " + j);
                    a++;
                }
            }
        }
    }
}
```

Remember to have the class named properly according to the file name if you are saving it in a file, and ensure you handle input and output in the way you intend for the Java application to run (using `Scanner` for console input in this snippet). Java requires more boilerplate to handle input compared to Python.
