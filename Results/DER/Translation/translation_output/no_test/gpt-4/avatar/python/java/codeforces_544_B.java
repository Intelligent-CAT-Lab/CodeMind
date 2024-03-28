Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int start = 0;
        String[] arr = new String[numbers[0]];
        int count = 0;
        for (int i = 0; i < numbers[0]; i++) {
            StringBuilder string = new StringBuilder();
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string.append(" L ");
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        string.append(" S ");
                    }
                } else {
                    string.append(" S ");
                }
            }
            arr[i] = string.toString();
        }

        if (count < numbers[1]) {
            System.out.println(" NO ");
        } else {
            System.out.println(" YES ");
            for (String s : arr) {
                System.out.println(s);
            }
        }
        scanner.close();
    }
}
```

This code follows the same logic as the provided Python code. The variables and the loops have been adjusted to match Java's syntax. Java doesn't have a direct equivalent to Python's list comprehension, so the input reading and parsing are done manually with a `Scanner`. Similarly, string manipulation uses `StringBuilder`, and arrays need to be defined with a size in Java. The output is printed to the console with `System.out.println`.
