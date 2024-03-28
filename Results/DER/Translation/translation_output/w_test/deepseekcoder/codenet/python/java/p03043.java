<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 10

Expected output:
0.145833333333


```
import math
from fractions import Fraction
N,K=map(int,input().split())
s=0
if N >= K:
  s=s+Fraction(N-K,N)
  d=0
  for i in range(K):
    a=math.log(K/(i+1),2)
    d=d+Fraction(1, 2)**(math.ceil(a))*Fraction(1, N)
else:
  d=0
  for i in range(N):
    a=math.log(K/(i+1),2)
    d=d+Fraction(1, 2)**(math.ceil(a))*Fraction(1, N)
print(float(s+d))
  
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double s = 0;
        if (N >= K) {
            s = s + (double)(N - K) / N;
            double d = 0;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, (int)Math.ceil(a)) / N;
            }
        } else {
            double d = 0;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, (int)Math.ceil(a)) / N;
            }
        }
        System.out.println(s + d);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the value of `s` and `d` based on the conditions in the Python code, and then prints the sum of `s` and `d`.
<|EOT|>
