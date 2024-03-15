```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        S = S.replace("BC", "D");
        int ACount = 0;
        int ans = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                ACount++;
            } else if (S.charAt(i) == 'D') {
                ans += ACount;
            } else {
                ACount = 0;
            }
        }
        
        System.out.println(ans);
    }
}
```
