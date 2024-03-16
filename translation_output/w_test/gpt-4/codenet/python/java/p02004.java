The Python code you provided is a mix of an interactive problem controller and an algorithm to count occurrences of 4 consecutive 'R' or 'L' characters in a string. The original code assumes that the input will be provided during runtime from standard input. In a Java translation, I'll have to modify this behavior to read input through a method parameter or standard input, depending on the context of usage.

Here's the Java translation of the core algorithm and a simple main method to use it:

```java
import java.util.Scanner;

public class ConsecutiveCharacters {

    public static int countConsecutiveFour(String s) {
        int count = 0;
        int temp = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                temp++;
                if (temp == 4) {
                    count++;
                    temp = 0;
                }
            } else {
                temp--;
                if (temp == -4) {
                    temp = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if ("0".equals(input)) {
                break;
            }
            System.out.println(countConsecutiveFour(input));
            // If we only expect a single input, we can break here unconditionally
            // break;
        }
        scanner.close();
    }
}
```
In this Java version, I've replaced the recursive function and complex imports with a straightforward method `countConsecutiveFour` that determines the occurrences of 'RRRR' or 'LLLL' in a provided string. The main method takes input from standard input within a loop, similar to the original Python program. Note that I've assumed when the input is "0", we should terminate the program. This is a common way to control interactive console applications.

