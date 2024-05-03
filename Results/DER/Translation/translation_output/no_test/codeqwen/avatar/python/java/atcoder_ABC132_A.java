Here is the Java version of your Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = Arrays.toString(sortArray(input()));
        if (s.equals("[a, a, b, b]") && s.equals("[c, c, d, d]") && !s.equals("[a, a, b, b]")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static char[] input() {
        // This is a placeholder for the actual input logic.
        // In a real scenario, you would read from the console or any other source.
        return new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd'};
    }

    public static char[] sortArray(char[] array) {
        Arrays.sort(array);
        return array;
    }
}
```

Please note that the `input()` function is a placeholder and should be replaced with the actual logic to read input from the user or any other source. The `sortArray()` function sorts the input array and returns the sorted array. The `main()` function then uses these functions to sort the input array and check if it meets the specified conditions.
