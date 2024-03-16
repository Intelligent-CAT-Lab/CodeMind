<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import math

class p01741:
    def run(self, inp, output):
        d = float(inp.readline())
        if d <1:
            output.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2):
            output.write("2")
        elif d < 2:
            output.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2) * 1.5:
            output.write("3")
        else:
            output.write(str(d * math.sqrt(2)))

if __name__ == "__main__":
    p01741().run(sys.stdin, sys.stdout)
```

This Python code does the same thing as the Java code. It reads a double from the standard input, and then writes to the standard output based on the value of the double. The conditions in the if-elif-else statements are the same as in the Java code.
<|EOT|>
