<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBW

Expected output:
45

```
s = input()

cnt = 0
l = 0

for i in range(len(s)):
    if s[i] == 'W':
        cnt += i-l
        l += 1

print(cnt)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int cnt = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l += 1;
            }
        }
        System.out.println(cnt);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of 'W's in the string, and then calculates the sum of the differences between the indices of the 'W's and the number of 'W's encountered so far. The result is then printed out.
<|EOT|>
