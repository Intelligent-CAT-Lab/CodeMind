Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] a = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(a);
        int[] b = {1, 4, 7, 9};
        boolean isEqual = Arrays.equals(a, b);
        String ans = isEqual ? "YES" : "NO";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into individual numbers, converts them to integers, sorts them, and then checks if they are equal to the array `b`. If they are, it prints "YES", otherwise it prints "NO".
