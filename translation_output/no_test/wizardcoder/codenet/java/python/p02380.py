Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
    def run(self, in_, out_):
        sc = java.util.Scanner(in_)
        a = sc.nextDouble()
        b = sc.nextDouble()
        cc = sc.nextDouble()
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        print(s)
        print(l)
        print(h)

        sc.close()

if __name__ == '__main__':
    p02380().run(java.lang.System.in, java.lang.System.out)
```

Note: The `java` package is not available in Python, so we need to use the `java.lang` package instead. Also, we need to use the `math` module to use the `sin` and `cos` functions.<|endoftext|>
