Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
3 5 7 11 31


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
import math

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True

def main():
    N = int(input())
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=' ')
            count += 1
        if count == N:
            break

if __name__ == '__main__':
    main()
```<|endoftext|>
