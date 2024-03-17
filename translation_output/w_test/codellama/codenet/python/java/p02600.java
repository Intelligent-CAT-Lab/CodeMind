<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
725

Expected output:
7


```
X = int(input())

if X >= 400 and X <= 599:
  print(8)
elif X >= 600 and X <= 799:
  print(7)
elif X >= 800 and X <= 999:
  print(6)
elif X >= 1000 and X <= 1199:
  print(5)
elif X >= 1200 and X <= 1399:
  print(4)
elif X >= 1400 and X <= 1599:
  print(3)
elif X >= 1600 and X <= 1799:
  print(2)
elif X >= 1800 and X <= 1999:
  print(1)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if (X >= 400 && X <= 599) {
            System.out.println(8);
        } else if (X >= 600 && X <= 799) {
            System.out.println(7);
        } else if (X >= 800 && X <= 999) {
            System.out.println(6);
        } else if (X >= 1000 && X <= 1199) {
            System.out.println(5);
        } else if (X >= 1200 && X <= 1399) {
            System.out.println(4);
        } else if (X >= 1400 && X <= 1599) {
            System.out.println(3);
        } else if (X >= 1600 && X <= 1799) {
            System.out.println(2);
        } else if (X >= 1800 && X <= 1999) {
            System.out.println(1);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the output to the console.</s>
