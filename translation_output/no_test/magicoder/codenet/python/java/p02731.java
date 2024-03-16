<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int hen = L / 3;
        System.out.println(Math.pow(hen, 3));
    }
}
```<｜end▁of▁sentence｜>
