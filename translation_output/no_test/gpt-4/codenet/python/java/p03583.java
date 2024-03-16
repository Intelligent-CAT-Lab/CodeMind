Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = 0;
        int h = 0;
        int w = 0;

        outerLoop:
        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                int tmp1 = N * i * j;
                int tmp2 = (4 * i * j) - (N * j) - (N * i);
                if (tmp2 != 0) {
                    int s = tmp1 / tmp2;
                    int m = tmp1 % tmp2;
                    if (m == 0 && s >= 0) {
                        n = i;
                        h = j;
                        w = s;
                        System.out.println(n + " " + h + " " + w);
                        break outerLoop;
                    }
                }
            }
        }
        
        scanner.close();
    }
}
```

I have created a `Main` class and enclosed the given Python code within its `main` method. I have added a `Scanner` object to read input from the user as an integer (`int N = scanner.nextInt();`) and replaced the `exit()` statement with a labeled break (`break outerLoop;`) to exit the nested loops. The print statement is adjusted to Java's syntax, and I've closed the `Scanner` object at the end to prevent resource leaks.
