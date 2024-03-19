<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2

Expected output:
64

```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(-(-n/(2*d+1)));
    }
}
```
This code reads two integers `n` and `d` from the standard input using the `Scanner` class, and then calculates the result of the expression `-(-n/(2*d+1))` and prints it to the standard output.

Note that the `Scanner` class is used to read the input from the standard input, and the `System.out.println()` method is used to print the result to the standard output.

Also, note that the `//` operator is used to perform integer division, which returns the integer part of the result.</s>
