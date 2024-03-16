Below is the translated version of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        if (K > ((N - 1) * (N - 2)) / 2) {
            System.out.println(-1);
            System.exit(0);
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
        
        sc.close();
    }
}
```

This code creates a class called `Main` with a `main` method that reads two integers `N` and `K` from the standard input, which corresponds to the functionality of the Python code's `MI()` function. The code then performs conditional checks and outputs the result to the standard output, which is equivalent to Python's `print` statements. Please note that the system input and output flows in Java are handled using `Scanner` for input and `System.out.println` for output, respectively. Additionally, `System.exit(0)` terminates the program in the event that `K` is too large, as in the Python code.
