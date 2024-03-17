<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2919

Expected output:
3719


```
n,r = [int(x) for x in input().split()]

if n < 10:
    print(r + (100 * (10 - n)))
else:
    print(r)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses an `if` statement to check if the input `n` is less than 10. If it is, it prints the result of adding `r` and 100 times the difference between 10 and `n`. If `n` is greater than or equal to 10, it simply prints `r`.</s>
