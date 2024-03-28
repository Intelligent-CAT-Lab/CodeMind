<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1.000

Expected output:
2.000000000000


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

python code:<fim_suffix><fim_middle>

```python
import math

def run(in_stream, out_stream):
    d = float(in_stream.readline())
    if d < 1:
        out_stream.write(str(d * math.sqrt(2)))
    elif d < math.sqrt(2):
        out_stream.write("2")
    elif d < 2:
        out_stream.write(str(d * math.sqrt(2)))
    elif d < math.sqrt(2) * 1.5:
        out_stream.write("3")
    else:
        out_stream.write(str(d * math.sqrt(2)))

if __name__ == "__main__":
    import sys
    run(sys.stdin, sys.stdout)
```
"""
<|endoftext|>
