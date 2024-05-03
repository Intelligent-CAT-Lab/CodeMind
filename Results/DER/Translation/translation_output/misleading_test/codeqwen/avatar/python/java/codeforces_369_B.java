Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int rem = 0;
        int ones = 0;
        StringBuilder string = new StringBuilder();
        ones = arr[arr.length - 1] % arr[1];
        for (int i = 0; i < arr[1]; i++) {
            string.append(arr[arr.length - 1] / arr[1] + (ones > 0 ? 1 : 0)).append(" ");
            ones--;
        }
        if (arr[0] != arr[1]) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.append(rem / (arr[0] - arr[1]) + (ones > 0 ? 1 : 0)).append(" ");
                ones--;
            }
        }
        System.out.println(string.toString().trim());
    }
}
```

This Java code does the same thing as your Python code. It reads an array of integers from the user, calculates the result and prints it.
