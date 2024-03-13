<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] result = ij(n);
        System.out.println(result[0] + result[1] - 2);
    }

    public static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (x / i == x / i) {
                return new int[]{i, x / i};
            }
        }
        return new int[]{0, 0};
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calls the `ij` function with this integer, and then prints the sum of the returned values minus 2. The `ij` function iterates from the input number down to 1, and when it finds a number that divides the input number evenly, it returns an array containing this number and the result of the division. If no such number is found, it returns an array with 0 and 0.<｜end▁of▁sentence｜>
