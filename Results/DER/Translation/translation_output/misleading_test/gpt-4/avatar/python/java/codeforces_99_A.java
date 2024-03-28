Here is the translation of the Python code you provided into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\.");

        if (num[0].charAt(num[0].length() - 1) == '9') {
            System.out.println("GOTO â Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }

        scanner.close();
    }
}
```

Make sure to compile and run the Java code using a Java environment and provide an input that matches the input from the test case when prompted.

Here's an explanation of the changes made within the translation:

1. Java code structure includes defining a public class (`Main`) and a main method where execution starts.
2. I imported `java.util.Scanner` to read input from the console.
3. I replaced `input()` with `scanner.nextLine()` which reads a line of input from the console.
4. In Java, strings are split using the `split(String regex)` method, where I used a double backslash (`\\`) before the period (`.`) because it's a special character in regular expression syntax.
5. In Python, string elements can be accessed using negative indices, which count from the end of the string. Java does not have such a feature, so I calculated the index from the beginning using `num[0].length() - 1`.
6. To check if the first character after the decimal point is greater or equal to 5, I used `substring(0, 1)` instead of direct indexing as in Python.
7. I enclosed the block of code within a class and the main method as required by Java's syntax.
8. Finally, I added a call to `scanner.close()` to close the scanner after it's no longer needed. This is considered good practice to avoid resource leaks in Java programs.

