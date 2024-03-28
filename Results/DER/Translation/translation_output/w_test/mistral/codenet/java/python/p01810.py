<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
7


```
import java.util.*;

public class p01810{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong(), K = sc.nextLong();
                        long ans = 0;
                        for(long i = 0; i < N - 1; i++){
                                ans = K * ((long)(ans / (K - 1))) + ans % (K - 1) + 1;
                        }
                        System.out.println(ans);
                }
        }
}
```
[/INST]
```python
N, K = map(int, input().split())
ans = 0
for i in range(N - 1):
    ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
print(ans)
```</s>
