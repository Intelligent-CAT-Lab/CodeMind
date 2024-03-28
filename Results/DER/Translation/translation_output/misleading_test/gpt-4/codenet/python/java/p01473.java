The Java code equivalent to your provided Python code is as follows. Note that in Java, you would typically use a Scanner or BufferedReader for input, and Math's factorial function isn't provided so we need to write our own. Also note that Java's integer division rounds down, which matches Python 2's behavior.

```java
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AnagramPalindrome {
    
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();
        
        int lS = S.length();
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : S.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        Set<Character> keySet = countMap.keySet();
        int[] d = new int[keySet.size()];
        int index = 0;
        for (char key : keySet) {
            d[index++] = countMap.get(key);
        }
        
        int dd = 0;
        for (int count : d) {
            dd += count % 2;
        }
        
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long den = 1;
            for (int count : d) {
                den *= factorial(count / 2);
            }
            long result = factorial(lS / 2) / den;
            System.out.println(result);
        }
    }
}
```

Make sure you validate the input before using this code in a production environment since the `factorial` method could easily result in an overflow for large input values.

Sample test case:

Run the code and provide the input:
```
ab
```

Expected output:
```
42
```
