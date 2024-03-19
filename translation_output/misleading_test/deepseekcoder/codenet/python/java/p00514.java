<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 0 3

Expected output:
94

```
n,m,r=map(int,input().split())
a,b=sorted([n-1,r-m*n])
d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print(0 if a<1 else u//d)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0], m = input[1], r = input[2];
        int a = Math.min(n-1, r-m*n);
        int b = Math.max(n-1, r-m*n);
        long d = factorial(a);
        long u = factorial(b+a) / factorial(b);
        System.out.println(a < 1 ? 0 : u / d);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the minimum and maximum of `n-1` and `r-m*n`, and then calculates the factorial of the minimum and the factorial of the sum of the minimum and maximum divided by the factorial of the maximum. The result is printed to the standard output.
<|EOT|>
