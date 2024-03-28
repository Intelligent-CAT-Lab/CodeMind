<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5 2 3

Expected output:
Ye

```
h, w, s, t = map(int, input().split())
if h * w % 2 == 1:
  if (s + t) % 2 == 1:
    print("No")
  else:
    print("Yes")
else:
  print("Yes")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the four integers `h`, `w`, `s`, and `t`. It then uses the modulo operator (`%`) to check if the product of `h` and `w` is odd, and if so, it checks if the sum of `s` and `t` is odd. If both of these conditions are true, it prints "No", otherwise it prints "Yes".</s>
