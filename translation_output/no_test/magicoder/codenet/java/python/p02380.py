<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

class p02380:
    def run(self, inp, out):
        sc = inp.readline().split()
        a, b, cc = map(float, sc)
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        out.write(str(s) + '\n')
        out.write(str(l) + '\n')
        out.write(str(h) + '\n')

p02380().run(input, print)
```

Please note that the ```input``` and ```print``` functions are used instead of ```System.in``` and ```System.out``` in the Java code. The ```input``` function reads a line from the standard input and the ```print``` function writes a string to the standard output.<｜end▁of▁sentence｜>
