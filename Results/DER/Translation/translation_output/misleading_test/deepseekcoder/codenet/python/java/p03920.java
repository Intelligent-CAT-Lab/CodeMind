<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3
27

```
N = int(input())
w = 0
for i in range(10 ** 5):
    if i * (i + 1) // 2 < N <= (i + 1) * (i + 2) // 2:
        w = i + 1
        break
for i in range(w, 0, -1):
    if N >= i:
        print(i)
        N -= i
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It first finds the largest `w` such that `w * (w + 1) / 2 <= N < (w + 1) * (w + 2) / 2`. Then it prints the numbers from `w` down to `1`, subtracting each number from `N` as it is printed.
<|EOT|>
