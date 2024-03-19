<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def input():
    global br
    global sc
    br = sys.stdin.readline().strip()
    sc = sys.stdin

def next_int():
    return int(input())

def next_long():
    return long(input())

def next():
    return input().strip()

def println(o):
    sys.stdout.write(o)
    sys.stdout.write(br)
    sys.stdout.flush()

def print(o):
    sys.stdout.write(o)
    sys.stdout.flush()

A = next_long()
B = next_long()
C = next_long()

max = B + C

if C >= B:
    C -= B
    B = 0
else:
    B -= C
    C = 0

if C >= A:
    C -= A

print(C > 0 and max - C + 1 or max)
```</s>
