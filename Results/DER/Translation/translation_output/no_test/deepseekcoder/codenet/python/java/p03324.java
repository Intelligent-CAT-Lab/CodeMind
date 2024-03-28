<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N != 100 else 100 ** D * (N + 1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        if (N != 100) {
            System.out.println((int)Math.pow(100, D) * N);
        } else {
            System.out.println((int)Math.pow(100, D) * (N + 1));
        }
    }
}
```
<|EOT|>
