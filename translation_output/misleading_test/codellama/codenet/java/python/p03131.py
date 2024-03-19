<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 6

Expected output:
-65

```
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
```
[/INST]
```python
import math

def main():
    K, A, B = map(int, input().split())
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
Note that in Python, the `//` operator is used for integer division, which returns the integer part of the result, while the `/` operator returns the floating-point result.
Also, the `math.max()` function is used to find the maximum of two numbers.</s>
