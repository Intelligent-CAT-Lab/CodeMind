Below is the equivalent Java code for the provided Python code. Please note that Java requires explicit type declarations, and reading input from the console is a bit more verbose as it requires utilization of a Scanner object.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.close();

        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        
        for (int i = 1; i <= N; i++) {
            Ts[i - 1] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        
        System.out.println(sum(Ts) - mini);
    }

    private static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }
}
```
To run the Java program, you need to input the values `5` and `2` separately followed by the Enter key, assuming you are using standard console input.

The `main` method encapsulates the entire logic, and I have defined an additional `sum` method to calculate the sum of array elements, similar to the `sum` function used in the Python code. Remember that in Java, indices start at `0` rather than `1`, hence the `i - 1` index in the array assignment within the for-loop.
