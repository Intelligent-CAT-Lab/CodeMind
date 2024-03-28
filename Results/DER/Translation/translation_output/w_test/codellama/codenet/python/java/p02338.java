<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
1


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
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `println()` method is used to print the output.
* The ternary operator `? :` is used to check if `N` is less than or equal to `K`, and print `1` if it is, and `0` otherwise.</s>
