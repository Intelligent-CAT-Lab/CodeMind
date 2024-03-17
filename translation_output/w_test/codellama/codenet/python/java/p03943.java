<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 30 20

Expected output:
Yes


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
```
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
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `String` class to store the result. The code first reads three integers from the user using the `nextInt()` method of the `Scanner` class, and then checks if any of the following conditions is true:

* `a + b == c`
* `a + c == b`
* `b + c == a`

If any of these conditions is true, the code sets the `ans` variable to "Yes", otherwise it sets it to "No". Finally, the code prints the value of the `ans` variable to the console.</s>
