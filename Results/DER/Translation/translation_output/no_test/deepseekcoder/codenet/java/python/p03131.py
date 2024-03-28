<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    K = int(sys.stdin.readline().strip())
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())

    sum = 1+K
    if(A < B):
        sum1 = 1
        if(A > sum1):
            K -= (A-sum1)
            sum1 = A
        sum1 += (B-A)*(K//2)
        if(K%2 == 1)
            sum1 += 1
        sum = max(sum, sum1)
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads in three long integers from the standard input, calculates the maximum possible sum of the integers, and prints the result. The Python `//` operator is used for integer division, which is equivalent to the Java `/` operator but rounds down to the nearest integer. The `max` function is equivalent to the Java `Math.max` method. The `print` function is equivalent to the Java `System.out.println` method.
<|EOT|>
