<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys
import math

so = sys.stdout
sc = sys.stdin
INF = float('inf')

def main():
    N = ni()
    
    count = 0
    for i in range(6, 55555, 5):
        if is_prime(i):
            so.write(str(i) + " ")
            count += 1
        if count == N:
            break

def is_prime(n):
    for i in range(2, math.isqrt(n) + 1):
        if n % i == 0:
            return False
    return True

def ni():
    return int(sc.readline())

def nl():
    return long(sc.readline())

def nsToChars():
    return list(sc.readline().strip())

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `N` from the standard input, then prints the first `N` prime numbers that are multiples of 5. The prime numbers are checked by the `is_prime` function, which checks if a number is prime by trying to divide it by all numbers up to its square root. The `ni`, `nl`, and `nsToChars` functions are helper functions for reading integers, long integers, and strings from the standard input, respectively. The `main` function is the entry point of the program.
<|EOT|>
