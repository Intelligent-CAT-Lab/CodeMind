<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.math.BigInteger;
import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        BigInteger bigA = BigInteger.valueOf(A);
        BigInteger bigB = BigInteger.valueOf(B);
        
        for (int x = -1000; x <= 1000; x++) {
            if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)) {
                System.out.println(x);
                return;
            }
        }
        
        System.out.println("No solution");
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import math

def main():
    A, B, N = map(int, input().split())
    for x in range(-1000, 1001):
        if math.pow(x, N) * A == B:
            print(x)
            return
    print("No solution")

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The `math.pow()` function is used to calculate the power of a number, and the `range()` function is used to iterate over a range of values. The `map()` function is used to convert the input string to a list of integers. The `return` statement is used to exit the function early if a solution is found.</s>
