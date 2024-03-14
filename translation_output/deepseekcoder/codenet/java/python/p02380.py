<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class p02380:
    def run(self, inp, output):
        sc = [float(i) for i in inp.readline().split()]

        a, b, cc = sc[0], sc[1], math.radians(sc[2])

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        output.write(str(s) + '\n')
        output.write(str(l) + '\n')
        output.write(str(h) + '\n')

if __name__ == "__main__":
    p02380().run(sys.stdin, sys.stdout)
```

This Python code does the same thing as the Java code. It reads three floating-point numbers from the standard input, calculates the area of the triangle, the length of the hypotenuse, and the height of the triangle, and writes these values to the standard output. The `math.radians` function is used to convert the angle from degrees to radians.
<|EOT|>
