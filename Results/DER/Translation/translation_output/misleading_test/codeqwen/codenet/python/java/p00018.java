Here is the Java equivalent of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Integer[] intNumbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(intNumbers);
        for (int i = intNumbers.length - 1; i >= 0; i--) {
            System.out.print(intNumbers[i] + " ");
        }
    }
}
```

This Java program does the following:

1. It reads a line of input from the user.
2. It splits the input into an array of strings.
3. It converts the array of strings into an array of integers.
4. It sorts the array of integers in ascending order.
5. It prints the elements of the sorted array in reverse order.
