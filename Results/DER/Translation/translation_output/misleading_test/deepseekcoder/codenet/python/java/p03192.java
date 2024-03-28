<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
-54

```
N = raw_input()
print len([i for i in N if i == '2'])

```

### Response:
Here is the Java equivalent of the given Python code:

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

This Java code reads a string from the input, then iterates over each character in the string. If the character is '2', it increments a counter. Finally, it prints the count.

You can test this code with the provided test case (1222) and it should output -54. However, please note that the expected output -54 is not correct as per the problem statement. It seems like there might be a misunderstanding in the problem statement. The expected output should be the count of '2's in the input string.
<|EOT|>
