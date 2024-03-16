Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input to be a single line of 4 characters
        String input = scanner.nextLine();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        
        int flag = 0;
        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            flag = 1;
        }
        // Overriding the flag to 0 if all characters are equal
        if (a == b && a == c && a == d) {
            flag = 0;
        }
        // Printing the result
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Please note the following differences when translating from Python to Java:
- Java needs a main class and method to run the program.
- Java is statically typed, so variables need to have explicit types.
- Java uses `System.out.println` to print text to the console rather than the `print` function.
- Reading input from the console is done using `Scanner` in Java.
- The code assumes that the input characters are given in one line without any separators.
- Error handling (e.g., ensuring exactly four characters are entered) is not included.
