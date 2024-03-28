<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
2


```
a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a + b) / 2;
        int d = (int) c;
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `int` cast is used to convert the result of the division to an integer. The `if` statement is used to check if the result of the division is greater than 0, and if it is, the result is incremented by 1 and printed. Otherwise, the result is printed as is.</s>
