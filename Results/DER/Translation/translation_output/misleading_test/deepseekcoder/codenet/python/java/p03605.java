<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29

Expected output:
Ys

```
if '9' in input():
    print('Yes')
else:
    print('No')
```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String numStr = Integer.toString(num);
        if (numStr.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads an integer from the input, converts it to a string, and checks if the string contains the character '9'. If it does, it prints "Yes", otherwise it prints "No".
<|EOT|>
