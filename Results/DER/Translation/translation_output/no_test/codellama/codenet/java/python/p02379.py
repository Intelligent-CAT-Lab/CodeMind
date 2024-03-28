<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    lines = input().split()
    list = [float(line) for line in lines]
    n = 4
    while n > 0:
        list[n] = float(lines[n])
        n -= 1
    print(math.sqrt((list[0] - list[2]) ** 2 + (list[1] - list[3]) ** 2))

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `BufferedReader` and `InputStreamReader` classes are not needed in Python, as the `input()` function can be used to read a line of input from the user. The `split()` method is used to split the input into a list of strings, and the `float()` function is used to convert each string to a floating-point number. The `math.sqrt()` function is used to calculate the square root of the sum of the squares of the differences between the two points.</s>
