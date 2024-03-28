```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                int distance = Math.max(n - i - 1, i + 1);
                res = Math.min(res, distance);
            }
        }
        
        if (res == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }
        
        sc.close();
    }
}
```
