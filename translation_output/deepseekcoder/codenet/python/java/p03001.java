<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] inputs = scanner.nextLine().split(" ");
        float w = Float.parseFloat(inputs[0]);
        float h = Float.parseFloat(inputs[1]);
        float x = Float.parseFloat(inputs[2]);
        float y = Float.parseFloat(inputs[3]);
        float mx = w/2;
        float my = h/2;
        float[] res = new float[2];
        res[0] = w*h/2;
        if (x==mx && y==my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}
```

This Java code does the same thing as the Python code. It reads four float numbers from the input, calculates the area of the rectangle and checks if the given point is at the center of the rectangle. The results are printed to the console.
<|EOT|>
