Here is the Java equivalent of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] abc = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            abc[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, splits it into an array of strings, converts each string to an integer, sorts the array, and then prints the sum of the first two elements.
