<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.0
3.0

```
public class p02380{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double a, b, cc;
    double s, l, h;

    a = sc.nextDouble();
    b = sc.nextDouble();
    cc = sc.nextDouble();
    cc = Math.toRadians(cc);

    s = a * b * Math.sin(cc) / 2.0;
    l = a + b + Math.sqrt(a * a + b * b - 2.0 * a * b * Math.cos(cc));
    h = b * Math.sin(cc);

    System.out.println(s);
    System.out.println(l);
    System.out.println(h);

    sc.close();
  }
  public static void main(String[] args){
    (new p02380()).run(System.in, System.out);
  }
}
```

@@ Response
```python
import math

def run(inp, out):
    a, b, cc = map(float, inp.readline().split())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out.write(str(s) + "\n")
    out.write(str(l) + "\n")
    out.write(str(h) + "\n")

if __name__ == "__main__":
    run(open(0), open(1))
```

This Python code does the same thing as the Java code. It reads three floating point numbers from the input, calculates the area of the triangle, the length of the hypotenuse, and the height of the triangle, and then prints these values to the output. The `math.radians` function is used to convert the angle from degrees to radians.<｜end▁of▁sentence｜>
