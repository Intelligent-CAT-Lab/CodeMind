<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

class p01741:
    def run(self, inp, out):
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
    p01741().run(input, print)
```

Please note that in Python, the `input()` function is used to read input from the user, and the `print()` function is used to output to the console. The `readline()` method is used to read a line of input from the `inp` object, and the `write()` method is used to output to the `out` object.<｜end▁of▁sentence｜>
