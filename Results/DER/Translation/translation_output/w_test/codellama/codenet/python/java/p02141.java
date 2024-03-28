<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6000 5000 20 10 400 300

Expected output:
0.75


```
def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2 , x + w//2) + max(-W//2, x-w//2))
b = (min(H//2 , y + h//2) + max(-H//2, y-h//2))
print(b/a)

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = Math.min(W / 2, x + w / 2) + Math.max(-W / 2, x - w / 2);
        int b = Math.min(H / 2, y + h / 2) + Math.max(-H / 2, y - h / 2);
        System.out.println(b / a);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `Math.min` and `Math.max` methods to calculate the values of `a` and `b`. Finally, it prints the result to the console.

Note that the `Math.min` and `Math.max` methods take two arguments, so we need to use the `+` operator to combine the results of the two calls.

Also, note that the `Scanner` class is used to read input from the user, and the `System.out.println` method is used to print the result to the console.</s>
