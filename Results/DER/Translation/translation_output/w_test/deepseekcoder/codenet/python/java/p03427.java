<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
18


```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (i == 0) {
                max = num - 1 + 9 * (n.length() - 1);
            } else {
                max += num;
            }
        }
        System.out.println(max);
    }
}
```

This Java code reads an integer from the standard input, converts it to a string, and then iterates over the string's characters. For each character, it converts it back to an integer and adds it to the `max` variable. If it's the first character, it subtracts 1 and adds 9 times the length of the string minus 1. Finally, it prints the `max` variable.
<|EOT|>
