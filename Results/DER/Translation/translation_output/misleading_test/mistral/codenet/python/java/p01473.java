<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ab

Expected output:
42

```
from math import factorial as f
S = raw_input()
lS = len(S)
d = [S.count(i) for i in set(list(S))]
dd = sum([i%2 for i in d])
if (lS%2 == 0 and dd != 0 ) or (lS%2 == 1 and dd != 1): 
		print 0
else:
	dnm = 1
	for i in d:
		dnm *= f(i/2)
	print f(lS/2)/dnm
```
[/INST]
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int[] d = new int[256];
        for (int i = 0; i < len; i++) {
            d[s.charAt(i)]++;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += d[i] % 2;
        }
        if (len % 2 == 0 && sum != 0) {
            System.out.println(0);
        } else if (len % 2 == 1 && sum != 1) {
            System.out.println(0);
        } else {
            BigInteger fact = BigInteger.ONE;
            for (int i = 1; i < len / 2 + 1; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact.divide(BigInteger.valueOf(len / 2)).intValue());
        }
    }
}
```</s>
