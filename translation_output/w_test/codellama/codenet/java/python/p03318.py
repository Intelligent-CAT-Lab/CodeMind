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
    k = int(input())
    num = 0
    d = 1
    for i in range(k):
        num += d
        if calculate_digits(num + 2 * d) < calculate_digits(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code provided. The `calculate_digits` function is similar to the `calc` function in the Java code, it calculates the sum of the digits of a number. The `main` function is also similar, it takes an input `k` and initializes `num` and `d` to 0 and 1 respectively. It then loops `k` times, adding `d` to `num` and checking if the sum of the digits of `num + 2 * d` is less than the sum of the digits of `num + d`. If it is, it multiplies `d` by 10. Finally, it prints `num`.</s>
