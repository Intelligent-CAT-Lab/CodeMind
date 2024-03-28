<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-21

```
n=int(input())
print((n-1)//2)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println((n-1)/2);
    }
}
```
This code takes an integer `n` as input and prints the value of `(n-1)/2`. The `Integer.parseInt()` method is used to convert the input string to an integer. The `args[0]` array contains the command-line arguments passed to the program, and the first element is the input integer. The `System.out.println()` method is used to print the result to the console.</s>
