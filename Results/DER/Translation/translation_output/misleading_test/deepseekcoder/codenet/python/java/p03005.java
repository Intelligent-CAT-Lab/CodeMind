<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
31

```
N,K=map(int,input().split())
if K==1:
    print(0)
else:
    print(N-K)
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```

This Java code reads two integers from the standard input, and then prints the difference between the two integers if the second integer is not 1, otherwise it prints 0.
<|EOT|>
