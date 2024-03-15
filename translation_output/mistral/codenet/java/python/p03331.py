<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for(int a = 2; a <= n/2; a++) {
            int b = n - a;
            int sum = digit(a) + digit(b);
            ans = Math.min(sum,ans);
        }
        System.out.println(ans);
    }
    
    static int digit(int num) {
        int r = 0;
        while(true) {
            r += (num%10);
            num /= 10;
            if(num == 0) break;
        }
        return r;
    }
}
```
[/INST]
```python
import sys

n = int(input())
ans = n
for a in range(2, n//2+1):
    b = n - a
    sum = sum(int(digit(a)) + int(digit(b)))
    ans = min(sum, ans)
print(ans)

def digit(num):
    r = 0
    while num != 0:
        r += num % 10
        num //= 10
    return r
```</s>
