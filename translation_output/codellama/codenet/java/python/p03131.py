<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03131{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long sum = 1+K;
        if(A < B){
            long sum1 = 1;
            if(A > sum1){
                K -= (A-sum1);
                sum1 = A;
            }
            sum1 += (B-A)*(K/2);
            if(K%2 == 1)
                sum1 += 1;
            sum = Math.max(sum, sum1);
        }
        System.out.println(sum);
   }
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    K = int(input())
    A = int(input())
    B = int(input())

    sum = 1 + K
    if A < B:
        sum1 = 1
        if A > sum1:
            K -= (A - sum1)
            sum1 = A
        sum1 += (B - A) * (K // 2)
        if K % 2 == 1:
            sum1 += 1
        sum = max(sum, sum1)

    print(sum)

if __name__ == "__main__":
    main()
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java. The `%` operator is used for modulo division in Python, which is equivalent to the `mod()` function in Java.</s>
