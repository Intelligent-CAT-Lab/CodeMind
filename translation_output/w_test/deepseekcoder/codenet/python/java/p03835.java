<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
6


```
k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (s - y - z >= 0 && s - y - z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then counts the number of pairs `(y, z)` such that `0 <= s - y - z <= k`. The result is then printed to the standard output.
<|EOT|>
