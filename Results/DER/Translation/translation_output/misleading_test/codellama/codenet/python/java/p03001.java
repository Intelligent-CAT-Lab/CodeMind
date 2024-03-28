<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
6.8558008881848735 82

```
w,h,x,y = map(float,input().split())
mx,my = w/2,h/2
res= []
res.append(w*h/2)
if x==mx and y==my:
    res.append(1)
else:
    res.append(0)
print(res[0],res[1])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double mx = w / 2;
        double my = h / 2;
        double res = w * h / 2;
        if (x == mx && y == my) {
            res = 1;
        } else {
            res = 0;
        }
        System.out.println(res);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it calculates the area of the rectangle and checks if the point `(x, y)` is inside the rectangle or not. If the point is inside the rectangle, it sets the result to `1`, otherwise it sets the result to `0`. Finally, it prints the result.

Note that the code assumes that the input is in the format `w h x y`, where `w` and `h` are the width and height of the rectangle, and `x` and `y` are the coordinates of the point.</s>
