<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```
import sys

n, k = map(int, sys.stdin.readline().split())
print((n // k + 1) * k)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using whitespace as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `n // k + 1` is the integer division of `n` by `k`, rounded up to the nearest integer.
* `* k` multiplies the result by `k`.
* `print()` prints the result to the standard output.</s>
