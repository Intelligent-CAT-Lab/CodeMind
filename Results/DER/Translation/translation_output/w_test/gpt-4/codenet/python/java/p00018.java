Here's the translated Java code that performs the same function as the given Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortAndPrintReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numbersString = input.split(" ");
        Integer[] numbers = new Integer[numbersString.length];

        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

This Java program reads a string of numbers separated by spaces from the standard input, converts them to integers, sorts them in descending order, and then prints them out. The program uses `Scanner` for input, `Integer[]` to handle the sorting in reverse order (as `int[]` does not work with `Collections.reverseOrder()`), and `Arrays.sort()` for the sorting.
