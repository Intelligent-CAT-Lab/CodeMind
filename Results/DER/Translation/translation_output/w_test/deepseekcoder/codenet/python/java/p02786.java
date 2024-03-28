<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
3


```
# -*- coding: utf-8 -*-

def atack(tairyoku):
    if tairyoku == 1:
        return 1
    else:
        return 1 + atack(int(tairyoku/2)) * 2

H = int(input())

ans = atack(H)

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        scanner.close();

        int ans = attack(H);

        System.out.println(ans);
    }

    public static int attack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + attack(tairyoku / 2) * 2;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, passes it to the `attack` method, and then prints the result. The `attack` method is a recursive function that calculates the number of attacks based on the given tairyoku.
<|EOT|>
