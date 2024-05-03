Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] x = input.split(" ");
        int[] xInt = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            xInt[i] = Integer.parseInt(x[i]);
        }
        int a = xInt[0];
        int b = xInt[1];
        System.out.print(Arrays.stream(xInt).min().getAsInt() + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and then finds the minimum value in the array. It then calculates the absolute difference between the two numbers and prints the result. If the difference is less than 2, it prints 0.
