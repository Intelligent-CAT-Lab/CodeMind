Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

def distance(x1, y1, x2, y2):
    return math.sqrt((x1-x2)**2 + (y1-y2)**2)

x1, y1, x2, y2 = map(float, input().split())
print(distance(x1, y1, x2, y2))
```

Explanation:

- We first import the `math` module to use the `sqrt()` function.
- We define a function `distance()` that takes in the coordinates of two points and returns the distance between them using the distance formula.
- We read the input as four floating-point numbers using `map(float, input().split())` and store them in `x1`, `y1`, `x2`, and `y2`.
- We call the `distance()` function with the input coordinates and print the result using `print()`.<|endoftext|>
