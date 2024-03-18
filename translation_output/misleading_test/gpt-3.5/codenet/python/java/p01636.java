```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int dfNum = Integer.parseInt(df);
            int smNum = Integer.parseInt(sm);
            if ((dfNum + smNum) % 2 == 0 && smNum >= dfNum && (smNum - dfNum) % 2 == 0) {
                ans++;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
```
