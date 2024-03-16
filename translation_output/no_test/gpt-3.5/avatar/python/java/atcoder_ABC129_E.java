```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = new StringBuilder(scanner.nextLine()).reverse().toString();
        long mod = (long) Math.pow(10, 9) + 7;
        List<Long> pows = new ArrayList<>();
        pows.add(1L);
        for (int i = 0; i < 100010; i++) {
            pows.add((pows.get(pows.size() - 1) * 3) % mod);
        }

        long dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (pows.get(i) + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}
```
