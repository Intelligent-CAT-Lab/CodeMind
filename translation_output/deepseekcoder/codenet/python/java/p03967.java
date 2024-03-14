<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads a string from the user, then it iterates over the string. For each character in the string, it checks if the index is even or odd. If the index is even, it subtracts 1 from `ret`. If the index is odd, it adds 1 to `ret`. If the character at the current index is 'p', it subtracts 1 from `ret`; otherwise, it adds 1 to `ret`. Finally, it prints the value of `ret`.
<|EOT|>
