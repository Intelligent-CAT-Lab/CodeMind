<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
1.41421356


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02379 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] lines=br.readLine().split(" ");
       double[] list=new double[4];
       int n=4;
       while(n-->0){
           list[n]=Double.parseDouble(lines[n]);
       }
       System.out.println(Math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])));
       
    }
}
```

@@ Response
```python
import math

def calculate_distance(x1, y1, x2, y2):
    return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)

def main():
    x1, y1, x2, y2 = map(float, input().split())
    print(calculate_distance(x1, y1, x2, y2))

if __name__ == "__main__":
    main()
```

In this Python code, we first import the `math` module which provides mathematical functions. We then define a function `calculate_distance` that takes four arguments (x1, y1, x2, y2) which represent the coordinates of two points in a 2D space. The function calculates the distance between the two points using the formula `sqrt((x1 - x2)^2 + (y1 - y2)^2)`.

In the `main` function, we take the input from the user, split it into four parts using the `split` function, and convert each part into a float using the `map` function. We then call the `calculate_distance` function with these four parts as arguments and print the result.

Finally, we call the `main` function when the script is run.<｜end▁of▁sentence｜>
