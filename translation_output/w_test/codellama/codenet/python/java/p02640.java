<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8

Expected output:
Yes


```
x, y = map(int, input().split())
count = 0
for a in range(x+1):
    b = x - a
    if (2*a + 4*b) == y:
        count = 1
        break
    else:
        pass
print("Yes" if count == 1 else "No")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if (2*a + 4*b == y) {
                count = 1;
                break;
            }
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}
```
This code uses a `Scanner` object to read the input from the user, and then it uses a `for` loop to iterate over the possible values of `a` and `b`. For each value of `a`, it calculates the corresponding value of `b` and checks if `2*a + 4*b` is equal to `y`. If it is, it sets `count` to 1 and breaks out of the loop. Finally, it prints "Yes" if `count` is 1, and "No" otherwise.</s>
