<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
64

Expected output:
27.935654253757406

```
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        
        System.out.println(sum / N);
    }
}
```

@@ Response
```python
N = int(input())
sum = 0

for i in range(1, N + 1):
    if i % 2 != 0:
        sum += 1

print(sum / N)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of all odd numbers from 1 to N, and then prints the average of these numbers.<｜end▁of▁sentence｜>
