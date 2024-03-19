<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 30 20

Expected output:
Yes"

```
a, b, c = map(int, input().split())

ans = "No"
if a + b == c:
  ans = "Yes"
if a + c == b:
  ans = "Yes"
if b + c == a:
  ans = "Yes"

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        }
        if (a + c == b) {
            ans = "Yes";
        }
        if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `if` statement to check if the sum of any two numbers is equal to the third number. If the sum is equal to the third number, the variable `ans` is set to "Yes", otherwise it is set to "No". Finally, the `System.out.println()` method is used to print the value of `ans` to the console.</s>
