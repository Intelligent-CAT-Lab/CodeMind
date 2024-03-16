<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import math

def main():
    N = int(input())
    result = 0

    for i in range(1, N+1):
        for j in range(1, N+1):
            a = math.gcd(i, j)
            for k in range(1, N+1):
                result += math.gcd(a, k)

    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then calculates the greatest common divisor (gcd) of three numbers (i, j, k) and adds the result to a running total. The final result is printed to the standard output.<｜end▁of▁sentence｜>
