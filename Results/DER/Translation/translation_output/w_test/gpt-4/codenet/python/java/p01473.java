Here's the Python code translated into Java. I've assumed that we'll use the `Scanner` class for input. Note that in Java, you'll need to import `java.math.BigInteger` for factorial calculations to handle potentially very large numbers:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.BigInteger;

public class PalindromePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int lS = S.length();
        Map<Character, Integer> characterCounts = new HashMap<>();
        
        // Populate the character count map
        for (char ch : S.toCharArray()) {
            characterCounts.put(ch, characterCounts.getOrDefault(ch, 0) + 1);
        }
        
        // Count the number of characters with odd counts
        int dd = 0;
        for (int count : characterCounts.values()) {
            if (count % 2 != 0) {
                dd++;
            }
        }
        
        // Check if the string can form a palindrome based on character counts
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int count : characterCounts.values()) {
                dnm = dnm.multiply(factorial(count / 2));
            }
            BigInteger result = factorial(lS / 2).divide(dnm);
            System.out.println(result);
        }
        scanner.close();
    }
    
    // Helper method to calculate factorial using BigInteger
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```

Keep in mind that in the factorial method, `BigInteger.valueOf(i)` is used to convert the primitive `int` value to a `BigInteger`. The `BigInteger` class handles arithmetic with arbitrarily large numbers, which is required for factorial calculations since they can quickly grow beyond the range of standard integer types.
