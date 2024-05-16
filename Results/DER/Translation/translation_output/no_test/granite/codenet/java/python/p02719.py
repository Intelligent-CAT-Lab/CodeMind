System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;
import java.math.*;
 
public class p02719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = Math.min(n%k, k-(n%k));
        System.out.println(ans);
    }

}
```


Answer:
```python
import sys

n, k = map(int, sys.stdin.readline().split())
ans = min(n % k, k - (n % k))
print(ans)
```<|endoftext|>
