<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
10

```
import java.io.PrintWriter;
import java.util.*;

public class p03186 {

    static String br = System.getProperty("line.separator");
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){
        Long A = nextLong();
        Long B = nextLong();
        Long C = nextLong();

        Long max = B+C;

        if(C >= B) {
            C -= B;
            B = 0L;
        }else{
            B -= C;
            C = 0L;
        }

        if(C >= A){
            C -= A;
        }else{
            C = 0L;
        }

        println(C>0 ? max-C+1 : max);
    }

    static int nextInt(){
        return Integer.parseInt(next());
    }
    static Long nextLong(){
        return Long.parseLong(next());
    }
    static String next(){
        return sc.next();
    }
    static void println(Object o){
        PrintWriter out = new PrintWriter(System.out);
        out.println(o);
        out.flush();
    }
   static void print(Object o){
       PrintWriter out = new PrintWriter(System.out);
       out.print(o);
       out.flush();
    }
}

```

### Response:
```python
import sys

def next_int():
    return int(next())

def next_long():
    return long(next())

def next():
    return sys.stdin.readline().rstrip()

def println(o):
    print(o)
    sys.stdout.flush()

def print(o):
    print(o, end="")
    sys.stdout.flush()

def main():
    A = next_long()
    B = next_long()
    C = next_long()

    max = B+C

    if C >= B:
        C -= B
        B = 0
    else:
        B -= C
        C = 0

    if C >= A:
        C -= A
    else:
        C = 0

    println(C>0 and max-C+1 or max)

if __name__ == '__main__':
    main()
```

Please note that Python does not have a built-in `long` type, so you may need to use the `int` type instead. Also, Python uses `and` and `or` for logical operations instead of `&&` and `||`. The `println` and `print` functions are equivalent to `println` and `print` in Java. The `main` function is the entry point of the program.
<|EOT|>
