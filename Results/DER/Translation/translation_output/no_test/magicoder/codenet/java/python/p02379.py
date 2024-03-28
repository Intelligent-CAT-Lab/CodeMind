<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

def main():
    lines = input().split()
    list = [0.0]*4
    n = 4
    while n > 0:
        n -= 1
        list[n] = float(lines[n])
    print(math.sqrt((list[0]-list[2])**2 + (list[1]-list[3])**2))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four floating-point numbers from the user, stores them in a list, and then calculates and prints the Euclidean distance between the first two and the last two numbers.<｜end▁of▁sentence｜>
