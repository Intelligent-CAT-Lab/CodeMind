<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder res = new StringBuilder();
        while(N > 0) {
            N -= 1;
            res.append((char)('a' + N % 26));
            N /= 26;
        }
        System.out.println(res.reverse());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, converts it to a base 26 number system, and then prints the result in reverse order. The `StringBuilder` class is used to build the result string, which is more efficient than using the `+=` operator in a loop. The `reverse()` method of `StringBuilder` is used to reverse the string.
<|EOT|>
