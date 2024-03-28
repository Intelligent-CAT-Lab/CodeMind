Below is the translation of the given Python code into Java. It reads a decimal number from standard input, rounds it to the nearest integer (using the `GOTO Vasilisa.` logic if the integer part ends in 9), and prints the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\.");
        int integerPart = Integer.parseInt(num[0]);
        if (num[0].charAt(num[0].length() - 1) == '9') {
            System.out.println("GOTO ▮ Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(integerPart + 1);
            } else {
                System.out.println(integerPart);
            }
        }
        scanner.close();
    }
}
```

Please note that in Java, when splitting a string with `.split()` method, the parameter should be a regex pattern. In this case, `"\\."` is used instead of `" ."` used in the Python code because the dot (`.`) is a special character in regex representing any character. To match the literal dot, it has to be escaped with two backslashes.

Also, the `scanner.nextLine()` method will read the whole line of input (equivalent to `input()` in Python) and we use `\\.` to split the string into the integer and fractional parts. The rest is a straightforward translation, with an if-else structure similar to the Python code. The Unicode symbol `â` has been replaced with a placeholder `▮` to match the output format you provided, assuming it's a typo or encoding issue. If there's a specific character that should be used instead, please replace the placeholder with the correct character.
