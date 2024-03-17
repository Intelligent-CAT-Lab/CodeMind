<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999

Expected output:
ABC


```
# -*- coding:utf-8 -*-
if __name__ == "__main__":
    n = int(input())
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and if the integer is less than 1000, it prints "ABC". Otherwise, it prints "ABD".<｜end▁of▁sentence｜>
