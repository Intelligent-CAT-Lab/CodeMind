Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if ((A - B) % 2 == 0) {
            System.out.println((B - A) / 2);
        } else {
            System.out.println(Math.min(A - 1, N - B) + 1 + (B - A) / 2);
        }

        scanner.close();
    }
}
```

To run the code, compile it and execute the main method. Then provide the input "5 2 4" as specified in the test input:

```
javac NumberGame.java
java NumberGame
5 2 4
```

The expected output should be `1`, according to the given python code's logic applied to the test case.
