<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
010
001


```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.print("0".repeat(a) + "1".repeat(w - a));
            } else {
                System.out.print("1".repeat(a) + "0".repeat(w - a));
            }
            System.out.println();
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `repeat` method to generate the required strings. The `repeat` method is a Java 11 feature, so if you are using an earlier version of Java, you may need to use a different method to generate the strings.</s>
