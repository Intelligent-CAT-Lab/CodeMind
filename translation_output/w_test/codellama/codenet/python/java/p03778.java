<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2 6

Expected output:
1


```
w, a, b = map(int, input().split())

if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `Math.abs()` method is used to calculate the absolute value of a number.
* The `if-else` statement is used to check if the absolute value of `a` and `b` is less than `w`, and print `0` if it is, or print the difference between the absolute value and `w` if it is not.</s>
