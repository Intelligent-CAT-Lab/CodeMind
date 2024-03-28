<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ab

Expected output:
0


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

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
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
            long dnm = 1;
            for (int i : map.values()) {
                dnm *= factorial(i / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads a string, counts the occurrences of each character, checks if the number of characters is even or odd and the number of characters with odd counts is 1 or more, and then calculates the factorial of half the length of the string divided by the factorial of half the counts of each character.

Please note that in Java, the factorial function returns a long value, and the division operation between two long values will result in an integer value. So, you may need to cast the result to long explicitly if you want to keep the fractional part.
<|EOT|>
