<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int hen = L / 3;
        System.out.println((int)Math.pow(hen, 3));
    }
}
```
<|EOT|>
