<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import math

def run(inp, out):
    a, b, cc = map(float, inp.readline().split())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out.write(str(s) + '\n')
    out.write(str(l) + '\n')
    out.write(str(h) + '\n')

def main():
    run(sys.stdin, sys.stdout)

if __name__ == "__main__":
    main()
```

In this Python code, we first import the `math` module to use the `sin`, `cos`, `sqrt` and `radians` functions. We then define a `run` function that takes an input stream and an output stream as arguments. This function reads the input from the input stream, calculates the area of the triangle, the perimeter of the rectangle, and the height of the triangle, and writes the results to the output stream. The `main` function calls `run` with `sys.stdin` and `sys.stdout` as arguments.
<|EOT|>
