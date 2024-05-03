Here is the Java equivalent of the Python code you provided:

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
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java program does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. It then iterates over the array, and when it finds the first zero, it prints the index of that zero (which is one more than the index in the array because array indices start at 0 in Java, but they start at 1 in Python). The `break` statement is used to exit the loop once it has found the first zero.
