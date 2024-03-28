Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    lines = input().split()
    list = [float(x) for x in lines]
    print(math.sqrt((list[0]-list[2])**2 + (list[1]-list[3])**2))

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `math` module to use the `sqrt()` function.
- We define a `main()` function that reads the input from the user and converts it to a list of floats.
- We calculate the Euclidean distance between the two points using the formula `sqrt((x1-x2)^2 + (y1-y2)^2)`.
- We print the result using the `print()` function.<|endoftext|>
