Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

class p01741:
    def run(self, in_, out_):
        sc = java.util.Scanner(in_)
        d = sc.nextDouble()
        if d < 1:
            out_.println(d * math.sqrt(2))
        elif d < math.sqrt(2):
            out_.println("2")
        elif d < 2:
            out_.println(d * math.sqrt(2))
        elif d < math.sqrt(2) * 1.5:
            out_.println("3")
        else:
            out_.println(d * math.sqrt(2))

        sc.close()

if __name__ == '__main__':
    p01741().run(System.in, System.out)
```

Note: The `java` package is not available in Python, so we need to use the `java.util.Scanner` class instead. Also, we need to import the `math` module to use the `sqrt` function.<|endoftext|>
