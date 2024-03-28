```java
import java.util.Scanner;

public class CountOddLengthNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            String hoge = String.valueOf(i+1);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```
