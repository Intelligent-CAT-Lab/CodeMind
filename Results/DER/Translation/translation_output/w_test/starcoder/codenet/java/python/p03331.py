<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15

Expected output:
6


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

python code:<fim_suffix><fim_middle>

```python
import sys

def digit(num):
    r = 0
    while True:
        r += (num%10)
        num /= 10
        if num == 0: break
    return r

def main():
    n = int(sys.stdin.readline())
    ans = n
    for a in range(2, n/2+1):
        b = n - a
        sum = digit(a) + digit(b)
        ans = min(sum, ans)
    print ans

if __name__ == '__main__':
    main()
```
<|endoftext|>
