<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
14

```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(len(bin(n)) - 2 if n else 0);
    }

    public static int len(String s) {
        return s.length();
    }

    public static String bin(int n) {
        return Integer.toBinaryString(n);
    }
}
```
This code takes an integer `n` as input and prints the number of bits in its binary representation. If `n` is 0, it prints 0.

Here's a breakdown of the code:

* `int n = Integer.parseInt(args[0]);`: This line takes the input `n` from the command line and converts it to an integer.
* `System.out.println(len(bin(n)) - 2 if n else 0);`: This line prints the number of bits in the binary representation of `n`. If `n` is 0, it prints 0.
* `len(bin(n)) - 2`: This expression calculates the number of bits in the binary representation of `n`. It first calls the `bin()` function to convert `n` to its binary representation, then it calls the `len()` function to get the length of the binary representation, and finally it subtracts 2 from the length to account for the leading "0b" prefix.
* `if n else 0`: This is a ternary expression that checks if `n` is 0. If it is, it returns 0. Otherwise, it returns the result of the `len(bin(n)) - 2` expression.

Note that this code assumes that the input `n` is a non-negative integer. If `n` is negative, the code will throw an exception.</s>
