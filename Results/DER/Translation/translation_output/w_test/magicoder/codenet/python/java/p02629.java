<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
b


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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String res = "";
        while (N > 0) {
            N -= 1;
            res += (char) ('a' + N % 26);
            N /= 26;
        }
        StringBuilder sb = new StringBuilder(res);
        System.out.println(sb.reverse().toString());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, converts it to a string in reverse alphabetical order, and then prints the result.<｜end▁of▁sentence｜>
