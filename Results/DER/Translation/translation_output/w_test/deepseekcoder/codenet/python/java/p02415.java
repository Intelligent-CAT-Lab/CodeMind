<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
fAIR, LATER, OCCASIONALLY CLOUDY.

Expected output:
Fair, later, occasionally cloudy.


```
s = input()
print(s.swapcase())

```

### Response:
Here is the Java equivalent of the Python code:

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

This Java program reads a line of input from the user, and then prints the input with all uppercase characters converted to lowercase and all lowercase characters converted to uppercase. The `swapCase` method does the actual swapping.

You can test this program with the provided test case: "fAIR, LATER, OCCASIONALLY CLOUDY." The expected output is "Fair, later, occasionally cloudy."
<|EOT|>
