<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintStream;
import java.util.Scanner;

public class p03362 {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    static final int INF = Integer.MAX_VALUE;

    static int[] mh = {0, 1, 0, -1};
    static int[] mw = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        int N = ni();
        
        int count = 0;
        for (int i = 6; i <= 55555; i+=5) {
            if (isPrime(i)) {
                so.print(i + " ");
                count++;
            }
            if (count == N)
                break;
        }
    } 
    
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int ni() {
        return sc.nextInt();
    }
    
    static long nl() {
        return sc.nextLong();
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }
}

```

@@ Response
```python
import sys
import math

def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    sqrt_n = math.isqrt(n)
    for i in range(3, sqrt_n + 1, 2):
        if n % i == 0:
            return False
    return True

def main():
    N = int(sys.stdin.readline())
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=' ')
            count += 1
        if count == N:
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `N` from the standard input, then prints the first `N` prime numbers that are multiples of 5. The `is_prime` function checks if a number is prime, and the `main` function iterates over the numbers from 6 to 55555 (inclusive), checking if each number is prime and a multiple of 5. If it is, it prints the number and increments the count. If the count reaches `N`, it breaks the loop.<｜end▁of▁sentence｜>
