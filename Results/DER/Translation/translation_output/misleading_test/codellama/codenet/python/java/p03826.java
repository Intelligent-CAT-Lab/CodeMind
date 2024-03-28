<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
101

```
a,b,c,d = map(int, input().split())
s = a*b
t = c*d
if s > t: print(s)
else: print(t)
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
        int d = sc.nextInt();
        int s = a*b;
        int t = c*d;
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. It then calculates the product of the two numbers and prints the result.

Note that the `map()` function is not available in Java, so we need to use a different approach to convert the input string to an integer. In this case, we use the `Integer.parseInt()` method to parse the input string as an integer.</s>
