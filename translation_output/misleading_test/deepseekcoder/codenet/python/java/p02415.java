<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(swapCase(s));
    }

    public static String swapCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
```

This Java code reads a line of input from the user, converts it to a character array, and then iterates over each character in the array. If the character is uppercase, it converts it to lowercase, and if it's lowercase, it converts it to uppercase. Finally, it converts the character array back to a string and returns it.

Please note that Java is case sensitive, so 'A' and 'a' are considered different characters.
<|EOT|>
