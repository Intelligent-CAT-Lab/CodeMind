<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 6

Expected output:
7


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

@@ Response
```python
import sys

def main():
    K, A, B = map(int, sys.stdin.readline().split())

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

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of 1 and the first integer, and then checks if the second integer is greater than the third. If it is, it calculates the sum of 1 and the second integer, and then adds the difference between the second and third integers multiplied by half of the first integer, and if the first integer is odd, it adds 1 to the sum. Finally, it prints the maximum of the sum and the calculated sum.<｜end▁of▁sentence｜>
