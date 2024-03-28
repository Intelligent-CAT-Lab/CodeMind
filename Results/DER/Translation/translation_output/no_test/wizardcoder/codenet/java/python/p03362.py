Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.io.PrintStream
import java.util.Scanner

class p03362:
    so = System.out
    sc = Scanner(System.in)
    INF = Integer.MAX_VALUE
    
    mh = [0, 1, 0, -1]
    mw = [1, 0, -1, 0]
    
    def main(self):
        N = self.ni()
        
        count = 0
        for i in range(6, 55556, 5):
            if self.isPrime(i):
                self.so.print(i + " ")
                count += 1
            if count == N:
                break
    
    def isPrime(self, n):
        for i in range(2, int(n**0.5)+1):
            if n % i == 0:
                return False
        return True
    
    def ni(self):
        return self.sc.nextInt()
    
    def nl(self):
        return self.sc.nextLong()
    
    def nsToChars(self):
        return self.sc.next().toCharArray()

p03362().main()
```<|endoftext|>
