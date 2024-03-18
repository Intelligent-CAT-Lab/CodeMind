```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        List<Character> charList = new ArrayList<>();
        for (char c : S.toCharArray()) {
            charList.add(c);
        }
        Set<Character> charSet = new HashSet<>(charList);

        int[] d = new int[charSet.size()];
        int index = 0;
        for (char ch : charSet) {
            d[index] = Collections.frequency(charList, ch);
            index++;
        }

        int dd = 0;
        for (int i : d) {
            if (i % 2 != 0) {
                dd++;
            }
        }

        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i : d) {
                dnm *= factorial(i/2);
            }
            System.out.println(factorial(lS/2) / dnm);
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```
