<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
4


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
Note: The `map` function in Python is not available in Java, so we need to use the `Scanner` class to read the input and convert it to integers.</s>
