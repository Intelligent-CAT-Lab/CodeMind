<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int dd = 0;
        for (int i : map.values()) {
            dd += i % 2;
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i : map.values()) {
                dnm = dnm.multiply(factorial(i / 2));
            }
            System.out.println(factorial(lS / 2).divide(dnm));
        }
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the occurrences of each character in the string, calculates the sum of the remainders of the counts divided by 2, and then checks if the conditions in the if-else statement are met. If they are, it prints 0. Otherwise, it calculates the factorial of the quotient of the string length divided by 2 and the product of the factorials of the quotients of the counts divided by 2, and then prints the result.<｜end▁of▁sentence｜>
