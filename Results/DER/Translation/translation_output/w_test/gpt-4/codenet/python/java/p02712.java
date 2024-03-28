Here's the equivalent Java code for your Python code. I will assume that this Java code will be part of a class with a `main` method, and that it will be reading from standard input (e.g., the console) just like the Python code does.

```java
import java.util.Scanner;

public class SumOfNonMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

To compile and run this Java program, use the following commands in a terminal or command line tool:
```
javac SumOfNonMultiples.java
java SumOfNonMultiples
```

When prompted, enter `15`, and the program should output `60`, matching the expected output in the test case provided.
