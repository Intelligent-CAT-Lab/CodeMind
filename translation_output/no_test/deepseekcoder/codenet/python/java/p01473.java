<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int lS = S.length();
        ArrayList<Integer> d = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            d.add(countChar(S, c));
        }
        int dd = (int) d.stream().filter(i -> i % 2 != 0).count();
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i : d) {
                dnm = dnm.multiply(factorial(i / 2));
            }
            System.out.println(factorial(lS / 2).divide(dnm));
        }
    }

    private static int countChar(String s, char c) {
        return (int) s.chars().filter(ch -> ch == c).count();
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

This Java code does the same thing as your Python code. It reads a string from the standard input, counts the occurrences of each character, checks if the number of odd counts is valid, and then calculates the factorial of the half length of the string divided by the product of the factorials of half the counts of each character.

Please note that Java does not have a built-in factorial function, so I used BigInteger to handle large factorials. Also, Java does not have a built-in count function for strings, so I wrote a helper method to count the occurrences of a character in a string.
<|EOT|>
