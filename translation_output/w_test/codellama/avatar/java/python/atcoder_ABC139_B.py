<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 8

Expected output:
1


```
import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}
```
[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```
This code reads the input from stdin, splits it into two integers `a` and `b`, and then uses a while loop to calculate the number of times `kuti` needs to be decremented by 1 and incremented by `a` until it reaches `b`. The number of iterations is stored in `tap`, and the final result is printed to stdout.</s>
