<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
n = int(input())
if n % 2 == 0:
    print(n)
else:
    print(2 * n)
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}
```
This code takes an integer `n` as input, and if `n` is even, it prints `n`. If `n` is odd, it prints `2 * n`.

Here's a sample test case:
```
$ java Main 3
6
```</s>
