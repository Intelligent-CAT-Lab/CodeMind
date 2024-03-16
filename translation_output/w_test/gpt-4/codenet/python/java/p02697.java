Below is the translated Java code that replicates the functionality of the provided Python code:

```java
import java.util.Scanner;

public class MiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int a = 1, b = N / 2;
        int c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a += 1;
        }

        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i++;
                c++;
                d--;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a++;
                b--;
                i++;
            } else {
                break;
            }
        }
        scanner.close();
    }
}
```

To test this code, you can compile and run it with the following input provided:
```
4 1
```

And you should expect an output of:
```
2 3
```
