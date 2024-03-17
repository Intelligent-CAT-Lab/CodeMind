<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
n=int(input())
print(1if n==0else 2//n)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(2 / n);
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check if the input is equal to 0. If it is, the program prints 1. Otherwise, it prints 2 divided by the input.
* The `System.out.println()` method is used to print the result to the console.

Note: The `//` operator is used for integer division in Java, which returns the integer part of the result.</s>
