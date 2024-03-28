<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
import java.util.*;

class p03963{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K;
        for(int i=2;i<=N;i++){
            ans *= K-1;
        }
        System.out.println(ans);
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

N, K = map(int, sys.stdin.readline().split())

ans = K
for i in range(2, N+1):
    ans *= K-1
print(ans)
```
<|endoftext|>
