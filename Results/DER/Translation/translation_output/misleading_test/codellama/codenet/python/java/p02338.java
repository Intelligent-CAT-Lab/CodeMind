<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
-52

```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-



def main():
    N, K = map(int, input().split())
    print(1 if N <= K else 0)

if __name__ == "__main__": main()


```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N <= K ? 1 : 0);
    }
}
```
This code reads two integers `N` and `K` from the standard input using the `Scanner` class, and then prints `1` if `N` is less than or equal to `K`, and `0` otherwise.

Here's an example of how to run this code:
```
$ java Main
5 10
1
```
This will print `1` because `5` is less than or equal to `10`.</s>
