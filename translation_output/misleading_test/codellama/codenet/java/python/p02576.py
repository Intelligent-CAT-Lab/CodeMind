<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
47

```
import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}
```
[/INST]
```
import sys

n, x, t = map(int, sys.stdin.readline().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```
This code uses the `map` function to convert the input from a string to a list of integers, and then uses a `while` loop to calculate the sum of the first `n` terms of the sequence. The `tako` variable is used to keep track of the number of terms that have been added to the sum, and the loop continues until `n` is greater than `tako`. The final result is printed to the console.</s>
