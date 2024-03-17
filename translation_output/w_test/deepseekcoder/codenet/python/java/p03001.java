<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double mx = w/2;
        double my = h/2;
        double[] res = new double[2];
        res[0] = w*h/2;
        if(x==mx && y==my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.printf("%.6f %.0f", res[0], res[1]);
    }
}
```

This Java code does the same thing as the Python code. It reads four double values from the input, calculates the area of the rectangle and checks if the point (x, y) is at the center of the rectangle. The result is then printed to the console. The area is printed with 6 decimal places and the second value is printed without any decimal places.
<|EOT|>
