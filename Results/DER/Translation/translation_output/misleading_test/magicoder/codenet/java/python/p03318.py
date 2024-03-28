<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def calc(num):
    n = float(num)
    sum = 0
    while num != 0:
        sum += num % 10
        num //= 10
    return n / sum

def main():
    K = int(input())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `K` from the standard input, then it iterates `K` times, adding `d` to `num` each time. If the result of `calc` function is less than the result of `calc` function with `d` added to `num`, it multiplies `d` by 10. Then it prints `num`. The `calc` function calculates the sum of the digits of a number and divides it by the number itself.<｜end▁of▁sentence｜>
