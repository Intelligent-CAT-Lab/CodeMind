System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_92_A {
    public static void codeforces_92_A(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int i = 1, req = 1;

        while (k - req >= 0) {
            if (k - req >= 0) {
                k = k - req;
            } else {
                break;
            }
            i++;
            if (i % n!= 0) {
                req = i % n;
            } else {
                req = n;
            }
        }

        System.out.println(k);
    }
}
```


Answer:
```python
import sys

def codeforces_92_A(args):
    n, k = map(int, args)
    i, req = 1, 1

    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n!= 0:
            req = i % n
        else:
            req = n

    print(k)

codeforces_92_A(sys.argv[1:])
```<|endoftext|>
