<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
33

Expected output:
2 -1


```
x=int(input())
for i in range(-1000,1000):
  for j in range(-1000,1000):
    if i**5-j**5==x:
      print(i,j)
      break
  else:
    continue
  break
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, and then it iterates over all pairs of integers `(i, j)` in the range `-1000 <= i, j <= 1000`. If it finds a pair `(i, j)` such that `i^5 - j^5 == x`, it prints `i` and `j` and stops.

Please note that in Java, the `**` operator is used for exponentiation, not `^`. So, `Math.pow(i, 5)` is used instead of `i**5`.
<|EOT|>
