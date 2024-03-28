<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
3


```
n = int(input())
a = (n+1)/2
print(int(a))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n+1)/2;
        System.out.println(a);
    }
}
```
This code first prompts the user to enter an integer value, which is stored in the variable `n`. Then, it calculates the value of `a` as `(n+1)/2` and prints it to the console.

Note that in Java, the `nextInt()` method is used to read an integer value from the console, and the `println()` method is used to print the result to the console.</s>
