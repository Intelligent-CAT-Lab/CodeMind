Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        while (true) {
            m++;
            if (pre % 2 == 0) {
                pre /= 2;
            } else {
                pre = 3 * pre + 1;
            }
            if (st.contains(pre)) {
                System.out.println(m);
                return;
            }
            st.add(pre);
        }
    }
}
```<|endoftext|>
