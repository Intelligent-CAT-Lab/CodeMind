<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
-21

```
# AOJ 1591 Graph Making
# Python3 2018.7.13 bal4u

n, d = map(int, input().split())
if d == 1: print(n*(n-1)//2)
else: print((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }
    }
}
```

This Java code reads two integers from the standard input (which is usually the console), and then it checks if the second integer is 1. If it is, it calculates and prints the result of the first formula. If it's not, it calculates and prints the result of the second formula.<｜end▁of▁sentence｜>
