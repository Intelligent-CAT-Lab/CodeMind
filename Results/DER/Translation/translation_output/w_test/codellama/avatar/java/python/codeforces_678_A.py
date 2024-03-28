<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```
[/INST]
```
import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```

Here's the Python code:
```
import sys

n, k = map(int, sys.stdin.readline().split())
print((n // k + 1) * k)
```
Note that in Python, the `//` operator is used for integer division, which is equivalent to the `floor()` function in Java.</s>
