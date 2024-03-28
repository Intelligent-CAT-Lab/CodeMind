<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
00000000000000000000000000001000
11111111111111111111111111110111
00000000000000000000000000010000
00000000000000000000000000000100


```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;
        System.out.printf("%032b%n", n);
        System.out.printf("%032b%n", ~n & mask);
        System.out.printf("%032b%n", (n << 1) & mask);
        System.out.printf("%032b%n", (n >> 1) & mask);
    }
}
```</s>
