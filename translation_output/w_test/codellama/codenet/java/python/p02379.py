<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import math

def main():
    x1, y1, x2, y2 = map(float, input().split())
    distance = math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)
    print(distance)

if __name__ == '__main__':
    main()
```
Explanation:

* The `map()` function is used to convert the input string into a list of floating-point numbers.
* The `math.sqrt()` function is used to calculate the square root of the sum of the squares of the differences between the x and y coordinates.
* The `print()` function is used to output the result.

Note: The `if __name__ == '__main__':` block is used to prevent the code from being executed when the file is imported as a module.</s>
