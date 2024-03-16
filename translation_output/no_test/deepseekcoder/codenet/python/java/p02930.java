<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
for i in range(n+1):
    for j in range(i+1,n):
      x = i^j
      ct = 0
      while (x>0):
        x //= 2
        ct += 1
      print(ct,end=" ")
    print("")

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = i ^ j;
                int ct = 0;
                while (x > 0) {
                    x >>= 1;
                    ct++;
                }
                System.out.print(ct + " ");
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then for each pair of integers from 0 to n (inclusive), it calculates the bitwise XOR of the two integers, counts the number of bits in the result, and prints that number.
<|EOT|>
