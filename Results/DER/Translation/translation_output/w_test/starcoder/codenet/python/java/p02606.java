<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
3


```
L, R, d = map(int, input().split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
