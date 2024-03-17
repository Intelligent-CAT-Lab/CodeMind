<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1.000

Expected output:
2.000000000000


```
public class p01741{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double d, i;
    d = sc.nextDouble();
    if(d < 1)out.println(d * Math.sqrt(2));
    else if(d < Math.sqrt(2))out.println("2");
    else if(d < 2)out.println(d * Math.sqrt(2));
    else if(d < Math.sqrt(2) * 1.5)out.println("3");
    else out.println(d * Math.sqrt(2));

    sc.close();
  }
  public static void main(String[] args){
    (new p01741()).run(System.in, System.out);
  }
}
```

@@ Response
```python
import math

def run(inp, out):
    d = float(inp.readline())
    if d < 1:
        out.write(str(d * math.sqrt(2)))
    elif d < math.sqrt(2):
        out.write("2")
    elif d < 2:
        out.write(str(d * math.sqrt(2)))
    elif d < math.sqrt(2) * 1.5:
        out.write("3")
    else:
        out.write(str(d * math.sqrt(2)))

if __name__ == "__main__":
    run(open(0), open(1))
```

This Python code does the same thing as the Java code. It reads a double from the input, and then checks a series of conditions to determine the output. The `open(0)` and `open(1)` are used to read from the standard input and write to the standard output, respectively.<｜end▁of▁sentence｜>
