
```python
import sys

def main():
    # Your code here!
    str = input()
    n = len(str)
    p = 2019
    ans = 0
    d = [0] * (n + 1)
    ten = 1
    for i in range(n - 1, -1, -1):
        a = ((ord(str[i]) - ord('0')) * ten) % p
        d[i] = (d[i + 1] + a) % p
        ten = (ten * 10) % p
    map = {}
    for i in range(n + 1):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            map[key] += 1
    for key in map:
        val = map[key]
        ans += val * (val - 1) // 2
    print(ans)

if __name__ == '__main__':
    main()
```

## 02703

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p02703 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long p = 1000000007;
        long ten = 1;
        for (int i = 0; i < 18; i++) {
            long a = (n / ten) % 10;
            long b = (n / (ten * 10)) % 10;
            long c = (n / (ten * 100)) % 10;
            long d = (n / (ten * 1000)) % 10;
            long e = (n / (ten * 10000)) % 
