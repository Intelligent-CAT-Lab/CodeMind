<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
                    break;
                }
            }
        }
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then iterates over all pairs of integers `(i, j)` in the range `-1000` to `1000`. If `i^5 - j^5` equals `x`, it prints `i` and `j` and breaks the inner loop. If no such pair is found, it continues with the next `i`.
<|EOT|>
