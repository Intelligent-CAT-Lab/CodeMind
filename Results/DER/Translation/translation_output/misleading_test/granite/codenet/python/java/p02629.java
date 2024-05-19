System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            N--;
            sb.append((char) (97 + N % 26));
            N /= 26;
        }
        String res = sb.reverse().toString();
        System.out.println(res);
    }
}
```

You can test this code with the following test case:

```
2
```

The expected output for this test case is:

```
z
``` <|endoftext|>
