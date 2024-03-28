<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
19


```
import java.util.*;
import java.util.stream.*;
 
public class p03318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        long num = 0, d = 1;
        for(int i = 0; i < K; i++)  {
            num += d;
            if(calc(num + 2 * d) < calc(num + d)) {
                d *= 10L;
            }
            System.out.println(num);
        }
    }
 
    public static double calc(long num) {
        double n = (double) num;
        double sum = 0;
        while(num != 0L) {
            sum += num % 10;
            num /= 10;
        }
        return n / sum;
    }
}
```

### Response:
```python
import sys

def calc(num):
    n = float(num)
    sum = 0
    while num != 0:
        sum += num % 10
        num //= 10
    return n / sum if sum != 0 else 0

def main():
    K = int(sys.stdin.readline().strip())
    num = 0
    d = 1
    for _ in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()
```

In this Python code, the `calc` function is equivalent to the `calc` method in the Java code. It calculates the ratio of the number to the sum of its digits. The `main` function is equivalent to the `main` method in the Java code. It reads the input, calculates the numbers, and prints them.
<|EOT|>
