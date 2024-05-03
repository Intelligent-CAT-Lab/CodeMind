Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] S = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxIndex = Arrays.stream(S).max().getAsInt();
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of integers, finds the maximum value in the array, and then prints the corresponding letter based on the index of the maximum value.
