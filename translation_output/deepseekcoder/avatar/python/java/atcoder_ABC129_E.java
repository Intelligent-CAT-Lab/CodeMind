<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
l = input ( ) [ : : - 1 ]
mod = 10 ** 9 + 7
pows = [ 1 ]
for i in range ( 10 ** 5 + 10 ) :
    pows . append ( ( pows [ - 1 ] * 3 ) % mod )
dp = 1
for i in range ( len ( l ) ) :
    if l [ i ] == '1' :
        dp = ( pows [ i ] + dp * 2 ) % mod
print ( dp )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.next();
        long mod = (long)Math.pow(10, 9) + 7;
        long[] pows = new long[100005 + 10];
        pows[0] = 1;
        for (int i = 1; i < 100005 + 10; i++) {
            pows[i] = (pows[i - 1] * 3) % mod;
        }
        long dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (pows[i] + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, calculates the powers of 3 modulo 10^9 + 7, and then calculates the result of the dynamic programming algorithm. The result is printed to the standard output.
<|EOT|>
