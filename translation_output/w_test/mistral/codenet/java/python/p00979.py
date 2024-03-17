<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
19

Expected output:
5


```
public class p00979
{
    
    public static long low = 1, high = (long)Math.pow(3, 32), n;
    
    public static void main(String[] args)
    {
        n = new java.util.Scanner(System.in).nextLong();
        long ans = (n == 0) ? -1 : dfs(1, 1);
        System.out.println(ans + 1);
    }
    
    public static long dfs(long pos, long pace)
    {
        if(pos > n) return 0;
        // 3.0X
        if(pace < high)
        {
            long npace = 3 * pace;
            long npos = pos + npace;
            if(npos == n & (npace == 1 | npace == 3)) return 1;
            else
            {
//                if(npos > n) return 0;
                long temp = dfs(npos, npace);
                if (temp != 0) return 1 + temp;
            }
        }
        
        // 1.0X
        {
            long npace = pace;
            long npos = npace + pos;
            if(npos == n & (npace == 1 | npace == 3)) return 1;
            else
            {
//                if(npos > n) return 0;
                long temp = dfs(npos, npace);
                if (temp != 0) return 1 + temp;
            }
        }
        
        // 0.3X
        if(pace > low)
        {
            long npace = pace / 3;
            long npos = pos + npace;
            if(npos == n & (npace == 3 | npace == 1)) return 1;
            else
            {
//                if(npos > n) return 0;
                long temp = dfs(npos, npace);
                if(temp != 0) return 1 + temp;
            }
        }
        return 0;
    }
    
}

```
[/INST]
```python
def dfs(pos, pace):
    if pos > n:
        return 0
    # 3.0X
    if pace < high:
        npace = 3 * pace
        npos = pos + npace
        if npos == n and (npace == 1 or npace == 3):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    # 1.0X
    npace = pace
    npos = npace + pos
    if npos == n and (npace == 1 or npace == 3):
        return 1
    else:
        temp = dfs(npos, npace)
        if temp != 0:
            return 1 + temp
    # 0.3X
    if pace > low:
        npace = pace // 3
        npos = pos + npace
        if npos == n and (npace == 3 or npace == 1):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    return 0

n = int(input())
ans = dfs(1, 1)
print(ans + 1)
```</s>
