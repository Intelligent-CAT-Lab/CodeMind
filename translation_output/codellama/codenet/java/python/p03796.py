<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    cnt = int(input())
    power = 1
    for i in range(1, cnt+1):
        power = (power*i)%(math.pow(10, 9) + 7)
    print(int(power))

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `math.pow()` function is used to calculate the power of 10 to the 9th power, and the `%` operator is used to calculate the remainder of the power calculation. The `int()` function is used to convert the result to an integer.</s>
