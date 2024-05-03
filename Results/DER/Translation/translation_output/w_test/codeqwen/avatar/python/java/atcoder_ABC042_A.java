Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (Arrays.stream(ABC).filter(i -> i == 5).count() == 2) {
            System.out.println(Arrays.stream(ABC).sum() == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of integers, and then checks if there are exactly two 5s in the array. If there are, it checks if the sum of the array is 17. If it is, it prints "YES"; otherwise, it prints "NO". If there are not exactly two 5s in the array, it also prints "NO".
