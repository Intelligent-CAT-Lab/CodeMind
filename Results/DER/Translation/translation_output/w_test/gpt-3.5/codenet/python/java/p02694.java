```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        int y = 100;
        int ans = 0;
        
        while (y < x) {
            ans++;
            y = (int) Math.floor(y * 1.01);
        }
        
        System.out.println(ans);
    }
}
```
