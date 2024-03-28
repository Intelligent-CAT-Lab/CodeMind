<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
-24.650930100857785

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

def calculate_distance(x1, y1, x2, y2):
    return math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))

input_values = input().split()
x1, y1, x2, y2 = map(float, input_values)

print(calculate_distance(x1, y1, x2, y2))
```

In this Python code, we first define a function `calculate_distance` that takes four arguments (x1, y1, x2, y2) and returns the Euclidean distance between the points (x1, y1) and (x2, y2). We then read the input from the user, split it into a list of strings, and convert each string to a float. We pass these values to the `calculate_distance` function and print the result.
<|EOT|>
