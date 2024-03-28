<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < lS; i++) {
            int count = S.count(S.charAt(i));
            if (d.contains(count)) {
                d.add(count);
            } else {
                d.add(count);
            }
        }
        int dd = 0;
        for (int i : d) {
            dd += i % 2;
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i : d) {
                dnm *= factorial(i / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```</s>
