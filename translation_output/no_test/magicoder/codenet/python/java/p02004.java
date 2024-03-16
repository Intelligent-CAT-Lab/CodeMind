<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 10**9+7
dd = [(-1,0),(0,1),(1,0),(0,-1)]
ddn = [(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    rr = []

    def f(n):
        r = 0
        t = 0
        for c in n:
            if c == 'R':
                t += 1
                if t == 4:
                    r += 1
                    t = 0
            else:
                t -= 1
                if t == -4:
                    t = 0
        return r

    while 1:
        n = S()
        if n == 0:
            break
        rr.append(f(n))
        break

    return '\n'.join(map(str, rr))


print(main())


```

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        List<Integer> rr = new ArrayList<>();

        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
            break;
        }

        for (int r : rr) {
            pw.println(r);
        }

        pw.close();
    }

    static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t++;
                if (t == 4) {
                    r++;
                    t = 0;
                }
            } else {
                t--;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, and if the string is "0", it breaks the loop. Otherwise, it calls the `f` function to count the number of times the string "RRRR" appears in the string. The count is then added to the `rr` list. Finally, it prints all the counts in the `rr` list.<｜end▁of▁sentence｜>
