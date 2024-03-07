<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = -(-B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }

        System.out.println(-1);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `divmod` method is not available in Java, so we have to use the `divide` and `mod` methods instead.</s>
