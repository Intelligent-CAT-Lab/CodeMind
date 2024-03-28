Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
public class p00979
{
    
    public static long low = 1, high = (long)Math.pow(3, 32), n;
    
    public static void main(String[] args)
    {
        n = new java.util.Scanner(System.in).nextLong();
        long ans = (n == 0)? -1 : dfs(1, 1);
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
                if (temp!= 0) return 1 + temp;
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
                if (temp!= 0) return 1 + temp;
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
                if(temp!= 0) return 1 + temp;
            }
        }
        return 0;
    }
    
}

```

### Response:
```python
import math

class p00979:
    
    low = 1
    high = int(math.pow(3, 32))
    n = None
    
    def main(self):
        self.n = int(input())
        if self.n == 0:
            print(-1)
        else:
            print(self.dfs(1, 1) + 1)
    
    def dfs(self, pos, pace):
        if pos > self.n:
            return 0
        # 3.0X
        if pace < self.high:
            npace = 3 * pace
            npos = pos + npace
            if npos == self.n and (npace == 1 or npace == 3):
                return 1
            else:
                if npos > self.n:
                    return 0
                temp = self.dfs(npos, npace)
                if temp!= 0:
                    return 1 + temp
        # 1.0X
        npace = pace
        npos = npace + pos
        if npos == self.n and (npace == 1 or npace == 3):
            return 1
        else:
            if npos > self.n:
                return 0
            temp = self.dfs(npos, npace)
            if temp!= 0:
                return 1 + temp
        # 0.3X
        if pace > self.low:
            npace = pace // 3
            npos = pos + npace
            if npos == self.n and (npace == 3 or npace == 1):
                return 1
            else:
                if npos > self.n:
                    return 0
                temp = self.dfs(npos, npace)
                if temp!= 0:
                    return 1 + temp
        return 0

p00979().main()
```<|endoftext|>
