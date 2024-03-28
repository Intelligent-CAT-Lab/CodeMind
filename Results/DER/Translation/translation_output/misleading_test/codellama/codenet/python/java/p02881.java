<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
-71

```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = ij(n);
        System.out.println(result);
    }

    public static int ij(int n) {
        for (int i = (int) Math.sqrt(n); i >= 0; i--) {
            if (n / i == n / i) {
                return i * n / i - 2;
            }
        }
        return 0;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `ij` function takes an integer `n` as input and returns the result of the calculation. The `main` function calls the `ij` function with the input `n` and prints the result.

The `ij` function uses a for loop to iterate from the square root of `n` to 0, and checks if `n/i` is equal to `n//i` (integer division). If it is, it returns `i * n / i - 2`. If it is not, it returns 0.

The `main` function calls the `ij` function with the input `n` and prints the result.

Note that the `ij` function is not a built-in function in Java, so you will need to define it yourself.</s>
