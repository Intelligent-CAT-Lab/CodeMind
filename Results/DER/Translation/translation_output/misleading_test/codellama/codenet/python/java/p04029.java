<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
62

```
n = int(input())
print(int((n + 1) * n / 2)) 
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(n * (n + 1) / 2);
    }
}
```
This code takes an integer `n` as input and calculates the sum of the first `n` positive integers using the formula `(n + 1) * n / 2`. The result is then printed to the console.

Note that in Java, the `parseInt()` method is used to convert a string to an integer, and the `System.out.println()` method is used to print the result to the console.</s>
