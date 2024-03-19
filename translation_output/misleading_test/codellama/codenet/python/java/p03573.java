<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
87

```
a,b,c=map(int,input().split())
if a==b:
    print(c)
elif b==c:
    print(a)
else:
    print(b)
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
        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `if-else` statement to check the values of `a`, `b`, and `c`. If `a` is equal to `b`, it prints `c`. If `b` is equal to `c`, it prints `a`. Otherwise, it prints `b`.</s>
