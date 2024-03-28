<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
4

```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = (x + n * b) % 1000000007;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the difference `d` between the first two, and the number `n` of times the second number `b` can be subtracted from `x` without going negative. Then it calculates the answer as `x + n * b` and prints it modulo `1000000007`.
<|EOT|>
