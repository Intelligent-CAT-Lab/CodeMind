<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
-79

```
a,b,c=map(int,input().split())
if a*c<b:
    print(c)
else:
    print(b//a)
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
        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```
The code first reads the input from the user using the `Scanner` class. It then calculates the result based on the given conditions and prints the output.

Note that in Java, the `/` operator is used for integer division, while the `%` operator is used for modulo division. Therefore, the code uses `b / a` instead of `b % a` to get the integer division result.</s>
