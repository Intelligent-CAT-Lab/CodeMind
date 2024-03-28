<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
fAIR, LATER, OCCASIONALLY CLOUDY.

Expected output:
Fajir, lateY, ?VcWyqcuaJ8$ cloudy

```
s = input()
print(s.swapcase())

```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(swapCase(s));
    }

    public static String swapCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
```

This Java code reads a line of input from the user, then calls the `swapCase` method to convert the case of each character in the string. The `swapCase` method iterates over each character in the string, checks if it's uppercase or lowercase, and appends the opposite case character to the result string. If the character is neither uppercase nor lowercase, it is appended as is. The result string is then returned.

You can test this code with the following test input:

```
Fair, Later, Occasionally Cloudy.
```

The expected output will be:

```
fAIR, lATER, oCCASIONALLY cLOUDY.
```<｜end▁of▁sentence｜>
