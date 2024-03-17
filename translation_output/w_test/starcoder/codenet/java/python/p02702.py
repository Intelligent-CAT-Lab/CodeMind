<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1817181712114

Expected output:
3


```
import java.util.*;

public class p02702 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int n = str.length();
        int p = 2019;
        
        // ans: iæ¡ç®ï½jæ¡ç®ã®é¨ååã2019ã®åæ°ã§ãããã¿ã¼ã³æ°
        // ex. 1817181712114
        //         ^^^^^
        long ans = 0;
        
        // 2019ã®åæ°ã«ãªãæ¡i, jã®çµã¿åããå¨æ¢ç´¢ã¯O(N^2)
        // -> åæ¡ã®ã2019ã®ä½ãããO(N)ã§è¨ç®ããã
        
        // d'[i]: å³ããiæ¡ç®ã®å¤ * 10^i (mod 2019)
        // ex. 1817181712114
        // d'[0]: 4 % 2019 -> 4
        // d'[1]: 10 % 2019 -> 10
        // d'[5]: 700000 (mod 2019) ->?
        // â¡ 7 * 10 * 10^4
        // â¡ 7 * 19240
        // â¡ 7 * 1069 = 7483 % 2019 = 1426
        
        // d[i]: d'[i]ã®ç´¯ç©å
        // d = {4,14,114,95}
        int[] d = new int[n+1];
        // ten: 10^i (mod 2019)
        int ten = 1;
        
        // d[i]ãè¨ç®ãã
        // (å³ã®æ¡(c[n-1])ããé ã«è¦ã)
        for (int i = n - 1; i >= 0; i--) {
            // 1000000 % 2019ã¯è¨ç®ããã©ãã®ã§ã
            int a = ((c[i] - '0') * ten) % p;
            d[i] = (d[i+1] + a) % p;
            ten = (ten * 10) % p;
        }
        
        // ãd[i] = d[j]ã¨ãªããã¨ã¯ã
        // ãex. 181712114 % 2019 = 2114 % 2019ãã
        // -> 181710000 â¡ 0 (mod 2019)
        // -> (ååå¼ã§å²ãç®ã¯mod pã¨äºãã«ç´ ã§ãªãã¨ä¸è½)
        // -> (gcd(2019, 10) = 1)
        // -> 18171 â¡ 0 (mod 2019)
        // -> 18171 % 2019 = 0
        // -> 18171ã¯2019ã®åæ°
        
        // map: d[]ã®å¤ã®é »åº¦
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = n; i >= 0; i--) {
            int key = d[i];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int val = map.get(key);
                map.put(key, val + 1);
            }
        }
        // åãå¤ã®åæ°nãã2ã¤é¸ã¶ãã¿ã¼ã³æ° = nC2
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            ans += (long)val * (val-1) / 2;
        }
        System.out.println(ans);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    # Your code here!
    str = sys.stdin.readline().strip()
    n = len(str)
    p = 2019

    # ans: iæ¡ç®ï½jæ¡ç®ã®é¨ååã2019ã®åæ°ã§ãããã¿ã¼ã³æ°
    # ex. 1817181712114
    #         ^^^^^
    ans = 0

    # 2019ã®åæ°ã«ãªãæ¡i, jã®çµã¿åããå¨æ¢ç´¢ã¯O(N^2)
    # -> åæ¡ã®ã2019ã®ä½ãããO(N)ã§è¨ç®ããã

    # d'[i]: å³ããiæ¡ç®ã®å¤ * 10^i (mod 2019)
    # ex. 1817181712114
    # d'[0]: 4 % 2019 -> 4
    # d'[1]: 10 % 2019 -> 10
    # d'[5]: 700000 (mod 2019) ->?
    # â¡ 7 * 10 * 10^4
