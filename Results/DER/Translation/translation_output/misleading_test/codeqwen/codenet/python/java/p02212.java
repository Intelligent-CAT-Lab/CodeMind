Here is the Java version of your Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] l = Arrays.stream(System.console().readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();
        System.out.println(Math.abs((l[0] + l[3]) - (l[1] + l[2])));
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the console, splits it into an array of strings, converts each string to an integer, sorts the array, and then calculates the absolute difference between the sum of the first and fourth elements and the sum of the second and third elements. The result is printed to the console.
