<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
111

Expected output:
141

```
N=int(input())
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0;
        int P = 0;
        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then iterates over the range from 0 to 9. For each iteration, it calculates `P` as `i * 111` and checks if `X` is less than `N` and `N` is less than or equal to `P`. If these conditions are met, it prints `P`. After that, it updates `X` with the value of `P`.
<|EOT|>
