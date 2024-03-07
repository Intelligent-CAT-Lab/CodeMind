<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

def run(in_stream, out_stream):
    sc = Scanner(in_stream)
    d = sc.nextDouble()
    if d < 1:
        out_stream.println(d * math.sqrt(2))
    elif d < math.sqrt(2):
        out_stream.println("2")
    elif d < 2:
        out_stream.println(d * math.sqrt(2))
    elif d < math.sqrt(2) * 1.5:
        out_stream.println("3")
    else:
        out_stream.println(d * math.sqrt(2))

    sc.close()

if __name__ == "__main__":
    run(sys.stdin, sys.stdout)
```
This is the equivalent Python code for the given Java code. The `Scanner` class is used to read input from the standard input stream, and the `math` module is used to perform mathematical operations. The `println` method is used to print output to the standard output stream. The `close` method is used to close the `Scanner` object. The `if __name__ == "__main__":` block is used to run the `run` function when the script is executed directly, rather than being imported as a module.</s>
