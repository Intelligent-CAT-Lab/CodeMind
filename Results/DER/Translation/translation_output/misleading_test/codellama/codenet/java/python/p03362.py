<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-81 55 101 -20 84

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
[/INST]

Here is the Python code that translates the Java code:
```python
import math

def is_prime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def main():
    N = int(input())
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=" ")
            count += 1
        if count == N:
            break

if __name__ == "__main__":
    main()
```
Note that the `is_prime` function is the same as the `isPrime` function in the Java code, and the `main` function is the same as the `main` function in the Java code. The only difference is that the Python code uses the `input` function to read the input from the user, and the `print` function to print the output.</s>
