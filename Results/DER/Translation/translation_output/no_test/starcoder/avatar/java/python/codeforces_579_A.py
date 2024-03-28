<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.ArrayList;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

python code:<fim_suffix><fim_middle>
```python
n = int(input())
s = " "
while n > 0:
    x = n % 2
    n //= 2
    s += str(x) + " "
ans = 0
for i in s:
    if i == "1":
        ans += 1
print(ans)
```
"""
<|endoftext|>
