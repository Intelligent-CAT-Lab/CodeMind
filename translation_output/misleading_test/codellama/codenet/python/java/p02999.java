<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
-70

```
a,b=map(int,input().split())
print(0 if a<b else 10)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(0);
        } else {
            System.out.println(10);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `if` statement to check if `a` is less than `b`. If it is, it prints `0`, otherwise it prints `10`.</s>
