<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import math

def run(d):
    if d < 1:
        return d * math.sqrt(2)
    elif d < math.sqrt(2):
        return 2
    elif d < 2:
        return d * math.sqrt(2)
    elif d < math.sqrt(2) * 1.5:
        return 3
    else:
        return d * math.sqrt(2)

d = float(input())
print(run(d))
```

In this Python code, we define a function `run` that takes a double `d` as input and returns a double. The function checks the value of `d` and returns a different value based on the conditions in the Java code. The input is read from the standard input and the result is printed to the standard output.
<|EOT|>
