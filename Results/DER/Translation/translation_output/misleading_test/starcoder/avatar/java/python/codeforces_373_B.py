<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6289344232651169 4170875805886064 618522710

Expected output:
635558

```

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import java.util.*;
import java.io.*;
import java.util.Collections;

public class codeforces_373_B {
    public static long ans = 0;

    public static long get(long a) {
        long ret = 0;
        long now = 1;
        long t = 1;
        
        for (;;) {
            if (now * 10 > a) {
                ret += (a - now + 1) * t;
                break;
            }
            
            ret += now * 9 * t;
            now *= 10;
            t++;
        }
        
        return ret;
    }

    public static long binarySearch(long k, long l, long r, long x) {
        if (r >= l) {
            long mid = l + (r - l) / 2;
            
            if (mid > ans && mid * k <= x)
                ans = mid;
            
            if (k * mid == x)
                return mid;
            
            if (k * mid > x)
                return binarySearch(k, l, mid - 1, x);
            
            return binarySearch(k, mid + 1, r, x);
        }
        
        return -1;
    }

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Scanner S = new Scanner(System.in);
        long gen, st, tim;
        gen = S.nextLong();
        st = S.nextLong();
        tim = S.nextLong();
        gen /= tim;
        long beg = st - 1, end = (long) Math.pow(10, 18);
        
        while (true) {
            long med = (beg + end) / 2 + 1;
            
            if (get(med) - get(st - 1) > gen) {
                end = med - 1;
            } else {
                beg = med;
            }
            
            if (beg == end) {
                System.out.println(beg - st + 1);
                break;
            }
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def get(a):
    ret = 0
    now = 1
    t = 1
    while True:
        if now * 10 > a:
            ret += (a - now + 1) * t
            break
        ret += now * 9 * t
        now *= 10
        t += 1
    return ret

def binarySearch(k, l, r, x):
    if r >= l:
        mid = l + (r - l) / 2
        if mid > ans and mid * k <= x:
            ans = mid
        if k * mid == x:
            return mid
        if k * mid > x:
            return binarySearch(k, l, mid - 1, x)
        return binarySearch(k, mid + 1, r, x)
    return -1

if __name__ == '__main__':
    gen, st, tim = map(int, sys.stdin.readline().split())
    gen /= tim
    beg = st - 1
    end = 10 ** 18
    while True:
        med = (beg + end) / 2 + 1
        if get(med) - get(st - 1) > gen:
            end = med - 1
        else:
            beg = med
        if beg == end:
            print(beg - st + 1)
            break
```

'''
<|endoftext|>
