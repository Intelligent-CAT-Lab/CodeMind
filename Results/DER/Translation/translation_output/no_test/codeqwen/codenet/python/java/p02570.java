Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] data = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        
        if (data[0] / (double) data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores them in an array. It then checks if the first element divided by the second element (converted to a double to handle floating point division) is less than or equal to the third element. If it is, it prints "Yes", otherwise it prints "No".
