<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
12


```
import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n, x, t = map(int, sys.stdin.readline().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```
<|endoftext|>
