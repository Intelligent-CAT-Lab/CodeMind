<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
1.0000000000


```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0 ? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```
[/INST]
```
import sys

n, m, d = map(int, sys.stdin.readline().split())

if d == 0:
    s = n
else:
    s = (n - d) * 2

print((s / n / n * (m - 1))[1:])
```
Note: The `[1:]` at the end of the print statement is used to truncate the decimal places to 10 digits.</s>
