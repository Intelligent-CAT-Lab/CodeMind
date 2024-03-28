<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class p03050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long ans = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
           if(n % i == 0) {
               long m = n / i - 1;
               if(i < m) ans += m;
           }
        }

        System.out.println(ans);
        
        br.close();
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import math

n = int(input())
ans = 0
for i in range(1, int(math.sqrt(n)) + 1):
    if n % i == 0:
        m = n // i - 1
        if i < m:
            ans += m

print(ans)
```
"""
<|endoftext|>
