Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int C = Integer.parseInt(input[3]);
        int D = Integer.parseInt(input[4]);

        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D * k - C * j >= B - A && C * k - D * j >= B - A) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as your Python code. It reads the input from the user, splits it into individual integers, and then iterates over the range from 0 to N. For each k, it calculates j and checks if the condition is met. If it is, it prints "YES" and returns from the main method. If it doesn't find a match after checking all values of k, it prints "NO".
