<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
3.000000 0


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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        float w = Float.parseFloat(input[0]);
        float h = Float.parseFloat(input[1]);
        float x = Float.parseFloat(input[2]);
        float y = Float.parseFloat(input[3]);
        float mx = w / 2;
        float my = h / 2;
        float[] res = new float[2];
        res[0] = w * h / 2;
        if (x == mx && y == my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.printf("%.6f %.0f", res[0], res[1]);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the area of the rectangle and checks if the given point is at the center of the rectangle. The result is then printed out with 6 decimal places for the area and no decimal places for the boolean value.<｜end▁of▁sentence｜>
