<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
2


```
import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));

        sc.close();
    }

    static int solve(int a, int b) {
        return (a + b + 1) / 2;
    }
}
```
[/INST]
```
import sys

def solve(a, b):
    return (a + b + 1) // 2

if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java. The `map()` function is used to convert the input strings to integers.</s>
