<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
th] cost! ofq >one a.pze i8s hixgher than t[_I o ne each.

```
import re
print(re.sub(r"(apple|peach)", lambda m: ["apple","peach"][m.group(0)=="apple"], input()))

```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace("apple", "temp")
                              .replace("peach", "apple")
                              .replace("temp", "peach");
        System.out.println(output);
    }
}
```

This Java code reads a line of input, then replaces "apple" with a temporary placeholder ("temp"), then replaces "peach" with "apple", and finally replaces the temporary placeholder with "peach". The result is the input string with "apple" and "peach" swapped.

Please note that this code assumes that the input string does not contain "temp". If the input string could contain "temp", you would need to handle that case separately.
<|EOT|>
