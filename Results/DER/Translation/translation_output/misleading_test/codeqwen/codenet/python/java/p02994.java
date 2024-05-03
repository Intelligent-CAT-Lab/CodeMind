Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        resolve();
    }

    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int L = Integer.parseInt(inputs[1]);
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            Ts[i] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        System.out.println(sum(Ts) - mini);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the sum of the sequence of integers from 1 to N with an offset of L-1, and then subtracts the smallest number from the sum. The `sum` method is a helper function that calculates the sum of an array of integers.
