<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:


```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        while (N > 0) {
            N--;
            res.append((char) ('a' + N % 26));
            N /= 26;
        }
        System.out.println(res.reverse().toString());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it converts it to the corresponding Excel column name. The `StringBuilder` class is used to build the string, and the `reverse()` method is used to reverse the string.<｜end▁of▁sentence｜>
