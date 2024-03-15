<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import math

def run(in, out):
    sc = math.scanner(in)
    a, b, cc = sc.next_double(), sc.next_double(), sc.next_double()
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    out.write(str(s) + '\n')
    out.write(str(l) + '\n')
    out.write(str(h) + '\n')

    sc.close()

if __name__ == '__main__':
    run(sys.stdin, sys.stdout)
```</s>
