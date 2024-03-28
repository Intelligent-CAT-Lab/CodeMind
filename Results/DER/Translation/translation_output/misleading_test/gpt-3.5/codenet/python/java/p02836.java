```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        int n = s.length()-1;
        int ans = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(n-i)) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
```
