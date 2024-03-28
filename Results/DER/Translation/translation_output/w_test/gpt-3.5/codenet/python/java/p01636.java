```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
```
