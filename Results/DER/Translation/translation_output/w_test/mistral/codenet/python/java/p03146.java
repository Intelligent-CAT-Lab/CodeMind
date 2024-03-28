<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
5


```
import sys
from collections import deque
#import numpy as np
import math
#sys.setrecursionlimit(10**6)
def S(): return sys.stdin.readline().rstrip()
def SL(): return map(str,sys.stdin.readline().rstrip().split())
def I(): return int(sys.stdin.readline().rstrip())
def IL(): return map(int,sys.stdin.readline().rstrip().split())

def solve():
    m = 1
    pre = s
    st = {s}
    while True:
        m += 1
        if pre%2==0:
            tmp = pre/2
        else:
            tmp = 3*pre+1
        if tmp in st:
            print(m)
            return
        pre = tmp
        st.add(tmp)
    return

if __name__=='__main__':
    s = I()
    solve()
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = 1;
        Set<Integer> st = new HashSet<>();
        int pre = s;
        while (true) {
            m++;
            if (pre % 2 == 0) {
                int tmp = pre / 2;
                if (st.contains(tmp)) {
                    System.out.println(m);
                    return;
                }
            } else {
                int tmp = 3 * pre + 1;
                if (st.contains(tmp)) {
                    System.out.println(m);
                    return;
                }
            }
            pre = tmp;
            st.add(tmp);
        }
    }
}
```</s>
