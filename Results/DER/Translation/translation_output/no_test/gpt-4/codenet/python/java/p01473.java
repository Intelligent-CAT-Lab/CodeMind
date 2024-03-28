Here is your Java code:

```java
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        int lS = S.length();
        Map<Character, Integer> countMap = new HashMap<>();
        
        for (char ch : S.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        
        int dd = 0;
        for (int count : countMap.values()) {
            if (count % 2 != 0) {
                dd++;
            }
        }
        
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int count : countMap.values()) {
                dnm = dnm.multiply(factorial(count / 2));
            }
            System.out.println(factorial(lS / 2).divide(dnm));
        }
        
        input.close();
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

Note that I used `BigInteger` for the factorial computation to support large numbers which the Python code implicitly supports. Also, since `raw_input()` is Python 2 syntax for getting a line of text from the user, I replaced it with `Scanner.nextLine()` in Java, which serves the same purpose. Division of integers in the factorial calls is also handled correctly because Java will automatically floor the result when you divide an integer by an integer.
