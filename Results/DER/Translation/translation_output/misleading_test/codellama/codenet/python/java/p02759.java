<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
-2

```
n = int(input())
a = (n+1)/2
print(int(a))
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = (n+1)/2;
        System.out.println(a);
    }
}
```
This code takes an integer `n` as input, calculates the value of `a` using the formula `(n+1)/2`, and then prints the result to the console.

Note that in Java, the `parseInt()` method is used to convert a string to an integer, and the `println()` method is used to print the result to the console.</s>
