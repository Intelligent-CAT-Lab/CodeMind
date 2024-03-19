<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double w = Double.parseDouble(input[0]);
        double h = Double.parseDouble(input[1]);
        double x = Double.parseDouble(input[2]);
        double y = Double.parseDouble(input[3]);
        double mx = w / 2;
        double my = h / 2;
        double[] res = new double[2];
        res[0] = w * h / 2;
        if (x == mx && y == my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the area of the rectangle and checks if the given point is at the center of the rectangle. The result is then printed out.<｜end▁of▁sentence｜>
