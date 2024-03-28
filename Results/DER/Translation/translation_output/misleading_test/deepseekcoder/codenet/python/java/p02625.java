<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
69

```
n,m=map(int,input().split())
d=[1]*(n+1)
for i in range(n):
  d[i+1]=((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(10**9+7)
print(d[-1])

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] d = new long[n+1];
        d[0] = 1;
        for (int i = 0; i < n; i++) {
            d[i+1] = ((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(long)Math.pow(10,9)+7;
        }
        System.out.println(d[n]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes an array `d` with size `n+1` and fills it with 1s, then calculates the value of the last element of the array using a loop. The result is printed to the console.

Please note that in Java, the `Math.pow(10,9)` is used to get the power of 10 raised to 9, and `(long)` is used to cast the result of `Math.pow(10,9)` to a long type.
<|EOT|>
