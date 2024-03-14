<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0], m = input[1], r = input[2];
        int[] ab = {n - 1, r - m * n};
        Arrays.sort(ab);
        int a = ab[0], b = ab[1];
        long d = 1, u = 1;
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                d *= i + 1;
            }
            for (int i = b; i < a + b; i++) {
                u *= i + 1;
            }
        }
        System.out.println(a < 1 ? 0 : u / d);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the input, calculates `n`, `m`, and `r`, calculates `a` and `b`, and then calculates and prints the result. The result is calculated using the factorial of `a` and `b`, which is the same as the Python code.
<|EOT|>
