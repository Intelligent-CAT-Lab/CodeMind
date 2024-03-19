<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-30

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

### Response:
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
    n, m = map(int, sys.stdin.readline().split())

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

In this Python code, we have translated the Java code. The main difference is that Python uses `sys.stdin.readline()` to read input from the console, and `map()` function to convert the input into integers. The rest of the code is the same.
<|EOT|>
