Here's the translated code from Python to Java:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        int rem = 0;
        int ones = arr[arr.length - 1] % arr[1];
        ArrayList<Integer> string = new ArrayList<>();
        
        for (int i = 0; i < arr[1]; i++) {
            string.add((arr[arr.length - 1] / arr[1]) + (ones > 0 ? 1 : 0));
            ones--;
        }
        
        if (arr[0] != arr[1]) {
            rem = arr[arr.length - 2] - arr[arr.length - 1];
            ones = rem % (arr[0] - arr[1]);
            for (int i = arr[1]; i < arr[0]; i++) {
                string.add((rem / (arr[0] - arr[1])) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        
        for (int i : string) {
            System.out.print(i + " \u2581 ");
        }
        scanner.close();
    }
}
```

This Java code follows the structure and logic of the Python code you provided. Here are the changes I made to adapt it to Java syntax:

1. Imports: Java doesn't have a direct equivalent to Python's `math` module for the operations we need here, because the division and addition operations are basic enough to use directly in Java.

2. The Python `input()` function is replaced with Java's `Scanner` class for reading input from the user.

3. Python list is replaced by `ArrayList<Integer>` in Java, as Java requires typed collections.

4. In Python, the `math.floor()` function is used when dividing integers to explicitly floor the result. In Java, integer division inherently floors the result, so we don't need a separate floor function.

5. The print statement has been replaced by `System.out.print()`, and the Python formatted string is replaced by a string concatenation plus the Unicode block character directly in the print statement.

6. I've added the `scanner.close();` at the end to close the `Scanner` after we're done using it, which is a good practice to release system resources, though not strictly necessary in this small program.

7. Java uses zero-based indexing for arrays, so `arr[arr.length - 1]` is used where `-1` as an index in Python is the last item of the array.

