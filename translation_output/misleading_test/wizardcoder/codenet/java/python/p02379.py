Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

def main():
    lines = input().split()
    list = [float(x) for x in lines]
    a = list[0]
    b = list[1]
    c = list[2]
    d = list[3]
    distance = math.sqrt((a-c)**2 + (b-d)**2)
    print(distance)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the math module to use the sqrt function.
- We define a function called main that takes no arguments.
- We read the input as a string using the input() function and split it into a list of strings using the split() function.
- We convert each string in the list to a float using a list comprehension.
- We assign the values of a, b, c, and d to variables.
- We calculate the distance between the two points using the formula sqrt((x1-x2)^2 + (y1-y2)^2).
- We print the distance using the print() function.<|endoftext|>
