<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
3


```
N = raw_input()
print len([i for i in N if i == '2'])

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

This Java code reads a string input from the user, then counts the number of '2's in the string and prints the count.
<|EOT|>
