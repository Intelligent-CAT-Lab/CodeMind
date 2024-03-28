<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 3

Expected output:
1


```
# -*- coding: utf-8 -*-


def main():
    n, k = list(map(int, input().split()))

    if n % k == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    main()

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```
This code reads two integers `n` and `k` from the standard input using the `Scanner` class, and then checks if `n` is divisible by `k`. If it is, it prints `0`, otherwise it prints `1`.</s>
