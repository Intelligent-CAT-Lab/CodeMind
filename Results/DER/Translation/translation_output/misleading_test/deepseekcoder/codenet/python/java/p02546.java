<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
apple

Expected output:
aTplVN

```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(s.length() - 1) == 's') {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if the last character of the string is 's', and if it is, it appends "es" to the string. If the last character is not 's', it appends "s" to the string. The result is then printed to the console.
<|EOT|>
