<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```
[/INST]
```
import math

def main():
    cnt = int(input())
    power = 1
    for i in range(1, cnt+1):
        power = (power*i)%(math.pow(10, 9) + 7)
    print(int(power))

if __name__ == '__main__':
    main()
```
This is the Python code that translates the given Java code. The `math` module is used to calculate the power of 10 to the 9th power plus 7, which is used in the modulo operation. The `input()` function is used to read the input from the user, and the `range()` function is used to iterate from 1 to the input value plus 1. The `print()` function is used to print the final result.</s>
