<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03999{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        for(int dx=0;dx<=s.length()-1;dx++){
            for(int start=0;start<=s.length()-1-dx;start++){
                long cur = Long.parseLong(s.substring(start,start+dx+1));
                ans += cur*(helper(start)*helper(s.length()-1-dx-start));
            }
        }
        System.out.println(ans);
    }
    static long helper(int n){
        if(n==0) return 1;
        return 1<<(n-1);
    }
}

```
[/INST]
```python
import sys

def helper(n):
    if n == 0:
        return 1
    return 1 << (n - 1)

def p03999():
    s = input()
    ans = 0
    for dx in range(len(s) + 1):
        for start in range(len(s) - dx):
            cur = int(s[start:start + dx])
            ans += cur * helper(start) * helper(len(s) - 1 - dx - start)
    print(ans)

if __name__ == "__main__":
    p03999()
```</s>
