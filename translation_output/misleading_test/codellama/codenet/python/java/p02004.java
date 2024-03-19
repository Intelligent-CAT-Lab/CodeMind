<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RRRRLLLLRRRR

Expected output:
-26

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'R') {
                count++;
                if (count == 4) {
                    result++;
                    count = 0;
                }
            } else {
                count--;
                if (count == -4) {
                    count = 0;
                }
            }
        }
        System.out.println(result);
    }
}
```
This is a solution to the problem in Java. It uses the `Scanner` class to read the input from the user, and then it iterates over the characters in the input string and keeps track of the number of 'R' characters and the number of 'L' characters. When the number of 'R' characters is equal to 4, it increments the result and resets the count. When the number of 'L' characters is equal to 4, it decrements the count and resets the result. Finally, it prints the result.</s>
