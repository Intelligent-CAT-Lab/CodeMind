<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
-46

```
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```
[/INST]
```
import math

def main():
    a, b, n = map(int, input().split())
    k = 0
    for i in range(1, int(math.ceil(n / a)) + 1):
        k += b
    print(k)

if __name__ == "__main__":
    main()
```
This code uses the `math.ceil()` function to round up the result of `n / a` to the nearest integer, and then loops through the range of values from 1 to the rounded-up value, incrementing `k` by `b` for each iteration. The final value of `k` is then printed.

Note that the `input()` function is used to read the input from the user, and the `split()` method is used to split the input into a list of strings, which are then converted to integers using the `map()` function.</s>
