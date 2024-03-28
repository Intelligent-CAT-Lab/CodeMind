<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
8


```

import java.util.Scanner;

public class p03683 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        long result = 0;

        if(Math.abs(n-m) > 1){
            result = 0;
        } else if(Math.abs(n-m) == 1){
            result = factorialsModBillion(n, m);
        } else {
            result = factorialsModBillion(n, m);
            result = (result * 2) % 1000000007L;
        }

        System.out.println(result);
    }

    private static long factorialsModBillion(int n, int m){
        long result = 1;
        for(long i = 1; i <= n; i++) {
            result = (result * i) % 1000000007L;
        }
        for(long i = 1; i <= m; i++) {
            result = (result * i) % 1000000007L;
        }
        return result;
    }
}

```

@@ Response
```python
import sys

def factorials_mod_billion(n, m):
    result = 1
    for i in range(1, n + 1):
        result = (result * i) % 1000000007
    for i in range(1, m + 1):
        result = (result * i) % 1000000007
    return result

def main():
    line = sys.stdin.readline().split()
    n = int(line[0])
    m = int(line[1])

    result = 0

    if abs(n - m) > 1:
        result = 0
    elif abs(n - m) == 1:
        result = factorials_mod_billion(n, m)
    else:
        result = factorials_mod_billion(n, m)
        result = (result * 2) % 1000000007

    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the factorial of both numbers modulo 1000000007, and then multiplies the results by 2 if the absolute difference between the two numbers is 1. If the absolute difference is greater than 1, it sets the result to 0.<｜end▁of▁sentence｜>
