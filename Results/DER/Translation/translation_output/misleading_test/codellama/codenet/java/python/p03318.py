<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
-6

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
[/INST]
```python
import math

def calculate_digits(num):
    sum = 0
    while num > 0:
        sum += num % 10
        num //= 10
    return sum

def main():
    K = int(input())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calculate_digits(num + 2 * d) < calculate_digits(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code provided. The `calculate_digits` function is used to calculate the sum of the digits of a number, and the `main` function is used to read the input `K` and perform the necessary calculations. The `d` variable is used to keep track of the current power of 10, and the `num` variable is used to keep track of the current number. The `if` statement is used to check if the sum of the digits of the current number plus twice the current power of 10 is less than the sum of the digits of the current number plus the current power of 10, and if so, the current power of 10 is multiplied by 10. Finally, the `print` statement is used to print the current number.</s>
