<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.00000000
12.00000000
3.00000000


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

python code:<fim_suffix><fim_middle>

```python
import math

def run(in_stream, out_stream):
    a = float(in_stream.readline())
    b = float(in_stream.readline())
    cc = float(in_stream.readline())
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out_stream.write(str(s) + '\n')
    out_stream.write(str(l) + '\n')
    out_stream.write(str(h) + '\n')

if __name__ == '__main__':
    import sys
    run(sys.stdin, sys.stdout)
```

'''
<|endoftext|>
