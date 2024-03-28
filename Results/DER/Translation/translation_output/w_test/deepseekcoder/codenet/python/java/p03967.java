<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
0


```
s=input()
ret=0
for i in range(len(s)):
    ret+=(i%2)-[0,1][int(s[i]=="p")]
print(ret)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 1 : 0);
        }
        System.out.println(ret);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then iterates over each character in the string. For each character, it checks if the index is even or odd, subtracts 1 if the index is odd and adds 1 if the index is even. If the character is 'p', it subtracts 1 from the result, otherwise it adds 1. The final result is printed out.
<|EOT|>
