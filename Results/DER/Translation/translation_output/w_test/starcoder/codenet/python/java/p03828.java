<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
4


```
from collections import Counter

MOD = 10**9 + 7
N = int(input())
count = Counter()
ans = 1
num = []

for i in range(2, N+1):
    
    for n in num:
        while not i % n:
            count[n] += 1
            i //= n
        if i == 1:
            break
    else:
        num.append(i)
        count[i] = 1
        
for n in count.values():
    ans = ans * (n+1) % MOD
print(ans)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int[] count = new int[N];
        int ans = 1;
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (i % num[j] == 0) {
                    count[j]++;
                    i /= num[j];
                    break;
                }
            } else {
                num[i-2] = i;
                count[i-2] = 1;
            }
        }
        for (int i = 0; i < N; i++) {
            ans = (ans * (count[i] + 1)) % 1000000007;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
