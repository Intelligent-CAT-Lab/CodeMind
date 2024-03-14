<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial as f
S = raw_input()
lS = len(S)
d = [S.count(i) for i in set(list(S))]
dd = sum([i%2 for i in d])
if (lS%2 == 0 and dd!= 0 ) or (lS%2 == 1 and dd!= 1): 
		print 0
else:
	dnm = 1
	for i in d:
		dnm *= f(i/2)
	print f(lS/2)/dnm
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int lS = S.length();
        int[] d = new int[26];
        for(int i = 0; i < lS; i++) {
            d[S.charAt(i) - 'a']++;
        }
        int dd = 0;
        for(int i = 0; i < 26; i++) {
            if(d[i] % 2!= 0) {
                dd++;
            }
        }
        if(lS % 2 == 0 && dd!= 0) {
            System.out.println(0);
        } else if(lS % 2 == 1 && dd!= 1) {
            System.out.println(0);
        } else {
            int dnm = 1;
            for(int i = 0; i < 26; i++) {
                dnm *= Math.pow(d[i] / 2, d[i] / 2);
            }
            System.out.println(Math.round(Math.pow(f(lS / 2), 1.0 / dnm)));
        }
    }
    public static int f(int n) {
        if(n == 0) {
            return 1;
        }
        return n * f(n - 1);
    }
}
```
<|endoftext|>
