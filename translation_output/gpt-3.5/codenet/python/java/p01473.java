```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        List<Character> characters = new ArrayList<>();
        for (char c : S.toCharArray()) {
            if (!characters.contains(c)) {
                characters.add(c);
            }
        }

        int[] d = new int[characters.size()];
        for (int i = 0; i < characters.size(); i++) {
            d[i] = Collections.frequency(characters, characters.get(i));
        }

        int dd = 0;
        for (int i : d) {
            if (i % 2 != 0) {
                dd++;
            }
        }

        BigInteger result;
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i : d) {
                dnm = dnm.multiply(factorial(i / 2));
            }
            result = factorial(lS / 2).divide(dnm);
            System.out.println(result);
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
```
