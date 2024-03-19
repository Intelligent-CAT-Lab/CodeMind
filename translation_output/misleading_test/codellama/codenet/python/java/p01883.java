<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
(

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
    n = I()
    a = [0]
    for i in range(1, 50000):
        a.append(a[-1] + i)

    t = bisect.bisect_left(a, n)
    r = [1] * t + [0] * t
    for i in range(t):
        ai = a[t-i]
        ti = t + i
        # print(n,ai,ti,''.join(map(lambda x: '()'[x], r)))
        if n < ai:
            ts = min(t, ai-n)
            r[ti],r[ti-ts] = r[ti-ts],r[ti]
            n -= t - ts
        else:
            break

    return ''.join(map(lambda x: '()'[x], r))




print(main())


```
[/INST]

Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Collections.binarySearch(Arrays.asList(a), n);
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            r.add(1);
        }
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r.set(ti, r.get(ti - ts));
                r.set(ti - ts, r.get(ti));
                n -= t - ts;
            } else {
                break;
            }
        }

        String result = r.stream().map(x -> x == 1 ? "(" : ")").collect(Collectors.joining());
        System.out.println(result);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` and `Collections` classes to perform various operations on arrays and lists. The `stream()` method is used to convert the list of integers to a stream of integers, and the `map()` method is used to map each integer to a string based on its value. Finally, the `collect()` method is used to collect the stream of strings into a single string.</s>
