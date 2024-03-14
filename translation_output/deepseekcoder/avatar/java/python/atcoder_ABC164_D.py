<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int[] mod_arr = new int[N];
        int[] mod_cnt = new int[2019];
        int radix = 1;
        
        for (int i = 0; i < N; i++) {
            int tmp = ((int) S.charAt(N - 1 - i) - (int) '0') * radix % 2019;
            if (i != 0) {
                tmp = (tmp + mod_arr[i - 1]) % 2019;
            }
            mod_arr[i] = tmp;
            mod_cnt[tmp]++;
            radix = radix * 10 % 2019;
        }
        
        long ans = 0L;
        mod_cnt[0]++;
        
        for (int i = 0; i < 2019; i++) {
            ans += mod_cnt[i] * (mod_cnt[i] - 1) / 2;
        }
        
        System.out.println(ans);
    }
}
```

### Response:
```python
import sys

def solve():
    S = sys.stdin.readline().strip()
    N = len(S)
    mod_arr = [0]*N
    mod_cnt = [0]*2019
    radix = 1
    
    for i in range(N):
        tmp = (int(S[N - 1 - i]) * radix) % 2019
        if i != 0:
            tmp = (tmp + mod_arr[i - 1]) % 2019
        mod_arr[i] = tmp
        mod_cnt[tmp] += 1
        radix = radix * 10 % 2019
    
    ans = 0
    mod_cnt[0] += 1
    
    for i in range(2019):
        ans += mod_cnt[i] * (mod_cnt[i] - 1) // 2
    
    print(ans)

solve()
```

This Python code reads a string from the standard input, calculates the number of substrings that have the same remainder when divided by 2019, and prints the result. The logic is the same as the Java code.
<|EOT|>
