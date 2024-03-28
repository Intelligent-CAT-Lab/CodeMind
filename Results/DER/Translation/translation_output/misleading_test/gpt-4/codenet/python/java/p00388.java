Below is the Java translation of the provided Python code, along with the test case:

```java
import java.util.Scanner;

public class SnailClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt(); // Get value for height
        int a = scanner.nextInt(); // Get value for climb up
        int b = scanner.nextInt(); // Get value for climb down
        scanner.close();

        System.out.println(countPossibleDays(h, a, b));
    }

    private static int countPossibleDays(int h, int a, int b) {
        int count = 0;
        for (int c = b - a; c >= 0; --c) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        return count;
    }
}
```

To run a test with the input "100 2 4" and get the expected output "-85", you would need to compile and run the `SnailClimb` class. However, since the provided Python code doesn't seem to be logically related to the test input and expected output, the direct Java translation will not output "-85" for the given input. It calculates the number of possible days based on certain climb criteria, which doesn't result in a negative number.

If there's a specific logic that should result in "-85" from the original Python code, please provide the accurate logic or correct the test case and expected output provided.
