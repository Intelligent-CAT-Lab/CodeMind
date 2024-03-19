<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
40

```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int e = input.length() - input.replace("+", "").length();
        int f = input.length() - input.replace("-", "").length();
        System.out.println(e - f);
    }
}
```

In this Java code, we use the `Scanner` class to read the input string. We then count the number of "+" and "-" characters in the string using the `replace` method. The length of the string before and after the replacement gives us the number of "+" and "-" characters, respectively. The difference between these counts gives us the desired output.
<|EOT|>
