<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def calc(num):
    n = float(num)
    sum = 0
    while num != 0:
        sum += num % 10
        num //= 10
    return n / sum

def main():
    K = int(sys.stdin.readline())
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

This Python code does the same thing as the Java code. It reads an integer `K` from the standard input, then it iterates `K` times, updating `num` and `d` according to the rules in the Java code. It then prints the current value of `num`. The `calc` function is also the same as in the Java code.<｜end▁of▁sentence｜>
