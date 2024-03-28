Below is the Java equivalent of the provided Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, sorts the array, and prints the sum of the first two integers.

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrings = scanner.nextLine().split(" ");
        int[] numbers = new int[inputStrings.length];

        for(int i = 0; i < inputStrings.length; i++) {
            numbers[i] = Integer.parseInt(inputStrings[i]);
        }

        Arrays.sort(numbers);
        System.out.println(numbers[0] + numbers[1]);

        scanner.close();
    }
}
```

To run the test case with input "700 600 780" using this Java code, the expected output would be "1300" as in the Python code example.
