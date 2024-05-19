System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1-(2+3-4+5)

Expected output:
5


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**13
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
    s = S()
    fm = {}

    a = []
    for c in s:
        if '0' <= c <= '9':
            ci = int(c)
            if len(a) > 0 and isinstance(a[-1], int):
                a[-1] = a[-1] * 10 + ci
            else:
                a.append(ci)
        else:
            a.append(c)

    def f(a):
        key = tuple(a)
        if key in fm:
            return fm[key]
        if len(a) == 2:
            fm[key] = [inf,-inf]
            return [inf,-inf]
        for i in range(len(a)):
            if a[i]!= '(':
                if i > 0:
                    a = a[i:]
                break
        for i in range(len(a)-1,-1,-1):
            if a[i]!= ')':
                a = a[:i+1]
                break
        if len(a) == 1:
            r = [a[0],a[0]]
            fm[key] = r
            return r

        ri = [inf]
        ra = [-inf]
        l = len(a)
        for i in range(1,len(a)-1):
            if not a[i] in ['+','-'] or (i > 1 and a[i-2] == '(') or (i+2 < l and a[i+2] == ')'):
                continue
            fl = f(a[:i])
            fr = f(a[i+1:])
            if a[i] == '+':
                ri.append(fl[0]+fr[0])
                ra.append(fl[1]+fr[1])
            else:
                ri.append(fl[0]-fr[1])
                ra.append(fl[1]-fr[0])

        r = [min(ri), max(ra)]
        fm[key] = r
        return r

    r = f(a)
    # print(r)
    # for k in sorted(fm.keys(), key=lambda x: [len(str(x)), str(x)]):
    #     print('k,fm[k]', ''.join(map(str,k)),fm[k])
    return r[1]


print(main())


```


Answer:
```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<String, int[]> map = new HashMap<>();

        String[] tokens = s.split("");
        int[] result = calculate(tokens, map);
        System.out.println(result[1]);
    }

    private static int[] calculate(String[] tokens, Map<String, int[]> map) {
        if (tokens.length == 1) {
            int[] result = new int[2];
            result[0] = Integer.parseInt(tokens[0]);
            result[1] = Integer.parseInt(tokens[0]);
            return result;
        }

        String key = String.join("", tokens);
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;

        for (int i = 1; i < tokens.length - 1; i++) {
            if (!tokens[i].equals("+") &&!tokens[i].equals("-")) {
                continue;
            }

            String[] leftTokens = Arrays.copyOfRange(tokens, 0, i);
            String[] rightTokens = Arrays.copyOfRange(tokens, i + 1, tokens.length);

            int[] leftResult = calculate(leftTokens, map);
            int[] rightResult = calculate(rightTokens, map);

            if (tokens[i].equals("+")) {
                result[0] = Math.min(result[0], leftResult[0] + rightResult[0]);
                result[1] = Math.max(result[1], leftResult[1] + rightResult[1]);
            } else {
                result[0] = Math.min(result[0], leftResult[0] - rightResult[1]);
                result[1] = Math.max(result[1], leftResult[1] - rightResult[0]);
            }
        }

        map.put(key, result);
        return result;
    }
}
```<|endoftext|>
