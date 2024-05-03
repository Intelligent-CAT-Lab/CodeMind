Here is the Java equivalent of the Python code you provided:

```java
import java.util.Arrays;
import java.util.Collections;
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
        
        Arrays.sort(intNumbers, Collections.reverseOrder());
        
        for (int number : intNumbers) {
            System.out.print(number + " ");
        }
    }
}
```

This Java code does the following:

1. It reads a line of input from the user.
2. It splits the input into an array of strings, where each string is a number.
3. It converts each string in the array to an integer and stores them in an array of integers.
4. It sorts the array of integers in descending order.
5. It prints each integer in the sorted array to the console, separated by a space.
