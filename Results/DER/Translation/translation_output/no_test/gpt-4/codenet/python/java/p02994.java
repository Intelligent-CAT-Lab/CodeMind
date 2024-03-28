Here's the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class TasteTester {

    public static void main(String[] args) {
        resolve();
    }

    private static void resolve() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            Ts[i] = i + 1 + offset;
            if(Math.abs(Ts[i]) < absmin) {
                absmin = Math.abs(Ts[i]);
                mini = Ts[i];
            }
        }

        int sum = sumArray(Ts);
        System.out.println(sum - mini);
        scanner.close();
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for(int value : array) {
            sum += value;
        }
        return sum;
    }
}
```

This code should replicate the functionality of the Python code provided. It reads two integers as input, calculates the taste values with the specified offset, determines the minimum absolute taste value, and prints the sum of the taste values excluding the minimum absolute taste value.
