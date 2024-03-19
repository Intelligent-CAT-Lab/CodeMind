<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-70

```
import java.util.*;

public class p02713{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int result = 0;
        int a = 0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                a =gcd(i, j);
                for(int k=1; k<=N; k++){
                    result += gcd(a, k);
                }
            }
        }
        System.out.println(result);
    }

    public static int gcd(int p, int q){
        if(p % q == 0){
            return q;
        }
        return gcd(q, p%q);
    }
}
```

### Response:
```python
import math

def main(N):
    result = 0
    for i in range(1, N+1):
        for j in range(1, N+1):
            a = math.gcd(i, j)
            for k in range(1, N+1):
                result += math.gcd(a, k)
    return result

N = int(input())
print(main(N))
```

In the Python code, we use the built-in `math.gcd()` function to calculate the greatest common divisor (gcd) of two numbers. The `range(1, N+1)` function is equivalent to the `for` loop in the Java code. The `input()` function is used to read the input from the user.
<|EOT|>
