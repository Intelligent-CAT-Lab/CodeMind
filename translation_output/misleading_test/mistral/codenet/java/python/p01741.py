<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1.000

Expected output:
-5.585596663525607

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
[/INST]
```python
import math

def run(in, out):
    sc = input(in)
    d = float(sc)
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
    run(input(), open(sys.stdout, 'w'))
```</s>
