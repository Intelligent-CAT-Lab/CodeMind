Here is the Java version of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        System.out.println(a + b + c - numbers[numbers.length - 1]);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, sorts them in ascending order, and then subtracts the largest number from the sum of the other two.
