<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    K = int(input("Enter a number: "))
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

def calc(num):
    n = float(num)
    sum = 0
    while num != 0:
        sum += num % 10
        num //= 10
    return n / sum

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. The `main()` function is the same, but the `calc()` function has been rewritten in Python.

The `calc()` function in Python takes a single argument, `num`, which is a long integer. It first converts `num` to a floating-point number using the `float()` function. Then, it calculates the sum of the digits of `num` using a while loop. The loop continues until `num` is equal to 0, at which point the sum is returned.

The `main()` function in Python is similar to the Java version, but it uses the `input()` function to get the value of `K` from the user. It then uses a for loop to iterate `K` times, calling the `calc()` function each time with the appropriate arguments. Finally, it prints the result of each call to `calc()` to the console.</s>
